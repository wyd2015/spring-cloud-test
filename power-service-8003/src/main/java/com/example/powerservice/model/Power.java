package com.example.powerservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: wcg
 * @Date: 2020/3/22 14:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Power implements Serializable {
    private int powerId;
    private String uri;
    private int userId;
}
