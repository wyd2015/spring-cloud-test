package com.example.userservice.service;

import com.example.userservice.api.PowerAPI;
import com.example.userservice.model.RestResult;
import com.wcg.userserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wcg
 * @Date: 2020/3/22 14:36
 */
@Service
public class UserService {

    @Autowired
    private PowerAPI powerAPI;

    public List<User> getuserList(){
        List<User> userList = Arrays.asList(new User(1, "wcg"), new User(2, "wyd"));
        return userList;
    }

    public User getUserInfo(int userId){
        RestResult result = powerAPI.getPowerByUserId(userId);
        List<Object> powers = (List<Object>) result.getData();
        return new User(1, "wcg", powers);
    }

}
