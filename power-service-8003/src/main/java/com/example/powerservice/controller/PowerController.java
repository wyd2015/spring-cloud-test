package com.example.powerservice.controller;

import com.example.powerservice.model.Power;
import com.example.powerservice.model.RestResult;
import com.example.powerservice.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wcg
 * @Date: 2020/3/22 14:52
 */
@RestController
@RequestMapping("/power")
public class PowerController {
    @Autowired
    private PowerService powerService;

    @GetMapping("/query")
    public RestResult getPowerByUserId(Integer userId){
        RestResult result = new RestResult();
        List<Power> powerList = powerService.getPowerByUserId(userId);
        result.setData(powerList);
        result.setMessage("power-service-8003 was invoked !");
        return result;
    }
}
