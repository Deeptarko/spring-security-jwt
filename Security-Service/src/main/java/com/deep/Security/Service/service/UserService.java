package com.deep.Security.Service.service;

import com.deep.Security.Service.entity.Role;
import com.deep.Security.Service.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String rolename);
    User getUser(String username);
    List<User> getUsers();
}
