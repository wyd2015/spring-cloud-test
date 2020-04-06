package com.example.userservice.api;

import com.example.userservice.model.RestResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

/**
 * @Author: wcg
 * @Date: 2020/3/22 21:22
 */
@FeignClient(name = "power-service")
public interface PowerAPI {
    @GetMapping("/power/query")
    RestResult getPowerByUserId(@RequestParam("userId") Integer userId);

    @Component
    class PowerAPIFallback implements PowerAPI {
        @Override
        public RestResult getPowerByUserId(Integer userId) {
            RestResult result = new RestResult();
            result.setData(Arrays.asList("挤爆了！"));
            result.setMessage("服务降级！");
            return result;
        }
    }
}
