package com.wcg.userserver.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: wcg
 * @Date: 2020/3/22 14:36
 */
public class User implements Serializable {
    private int userId;
    private String name;
    private List<Object> powers;

    public User() { }

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public User(int userId, String name, List<Object> powers) {
        this.userId = userId;
        this.name = name;
        this.powers = powers;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getPowers() {
        return powers;
    }

    public void setPowers(List<Object> powers) {
        this.powers = powers;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
