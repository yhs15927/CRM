package com.yhs.service;

import com.yhs.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getById(User user);
    void insert(User user);

    List<Map<String, Object>> getNameAndDept(String deptno);
}
