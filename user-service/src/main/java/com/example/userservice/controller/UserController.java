package com.example.userservice.controller;

import com.example.userservice.model.RestResult;
import com.example.userservice.service.UserService;
import com.wcg.userserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wcg
 * @Date: 2020/3/22 14:34
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    @GetMapping("/list")
    public RestResult listUsers(){
        RestResult result = new RestResult();
        result.setData(userService.getuserList());
        return result;
    }

    @GetMapping("/info")
    public RestResult getUserInfo(Integer userId){
        RestResult restResult = new RestResult();
        User user = userService.getUserInfo(userId);
        restResult.setData(user);
        return restResult;
    }

    @GetMapping("/test")
    public RestResult testLoadBalanced(){
        RestResult obj1 = restTemplate.getForObject("http://POWER-SERVICE/power/query?userId=1", RestResult.class);
        RestResult obj2 = restTemplate.getForObject("http://POWER-SERVICE/power/query?userId=1", RestResult.class);
        List<RestResult> list = Arrays.asList(obj1, obj2);
        return new RestResult(0, list, "成功了吗？");
    }
}
