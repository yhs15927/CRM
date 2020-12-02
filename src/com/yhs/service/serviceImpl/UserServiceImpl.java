package com.yhs.service.serviceImpl;

import com.yhs.dao.UserDao;
import com.yhs.domain.User;
import com.yhs.service.UserService;
import com.yhs.util.SqlSessionUtil;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao userdao = SqlSessionUtil.getSession().getMapper(UserDao.class);
    @Override
    public List<User> getById(User user) {
        List<User> list = userdao.getById(user);
        return list;
    }

    @Override
    public void insert(User user) {
        userdao.insert(user);
    }

    @Override
    public List<Map<String, Object>> getNameAndDept(String deptno) {
        return userdao.getNameAndDept(deptno);

    }
}
