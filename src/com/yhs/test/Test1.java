package com.yhs.test;

import com.yhs.domain.User;
import com.yhs.service.UserService;
import com.yhs.service.serviceImpl.UserServiceImpl;
import com.yhs.util.ServiceFactory;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        UserService userService = (UserService) ServiceFactory.getService(new UserServiceImpl());
        String deptno = "40";
        List<Map<String,Object>> mapList = userService.getNameAndDept(deptno);
        for(Map<String,Object> map : mapList){
            Set<String> keys = map.keySet();
            for(String key :keys){
                System.out.println("key:"+key);
                System.out.println("value:"+map.get(key));
            }
            System.out.println("----------------");
        }
    }
}
