package com.microservices.users.service;

import com.microservices.users.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService{

    //Fake user list : in real time you have to get data from database;

    List<User> list = List.of(
            new User(123L,"Abhinav Gautam","987412345"),
            new User(124L,"Rahul Kumar","1234567"),
            new User(125L,"Mohan Raj","087412345"),
            new User(126L,"Manish Monu","847412345")


    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null); //Lambda expression
    }
}
