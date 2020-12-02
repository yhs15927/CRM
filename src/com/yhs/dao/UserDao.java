package com.yhs.dao;

import com.yhs.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getById(User user);
    void insert(User user);
    List<Map<String, Object>> getNameAndDept(String deptno);
}
