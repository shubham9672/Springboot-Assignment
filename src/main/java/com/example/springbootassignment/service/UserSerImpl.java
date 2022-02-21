package com.example.springbootassignment.service;

import com.example.springbootassignment.entites.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSerImpl implements UserSer {
    List<User> list;

    public UserSerImpl() {
        list = new ArrayList<>();
        list.add(new User(1,"Shubham Menroy","shubham@gmail.com"));
        list.add(new User(2,"Sunny","Sunny@gmail.com"));
    }

    @Override
    public List<User> getUsers() {
        return list;
    }

}
