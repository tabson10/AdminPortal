package com.example.adminportal.service;

import com.example.adminportal.domain.User;
import com.example.adminportal.domain.security.PasswordResetToken;
import com.example.adminportal.domain.security.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);
}
