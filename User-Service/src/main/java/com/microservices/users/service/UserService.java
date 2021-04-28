package com.microservices.users.service;

import com.microservices.users.entity.User;

public interface UserService {

    public User getUser(Long userId);

}
