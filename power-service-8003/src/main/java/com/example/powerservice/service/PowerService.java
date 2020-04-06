package com.example.powerservice.service;

import com.example.powerservice.model.Power;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wcg
 * @Date: 2020/3/22 14:53
 */
@Service
public class PowerService {
    public List<Power> getPowerByUserId(int userId){
        return Arrays.asList(new Power(1, "/login", 1), new Power(2, "/user/list", 1), new Power(3, "/power/query", 1));
    }
}
