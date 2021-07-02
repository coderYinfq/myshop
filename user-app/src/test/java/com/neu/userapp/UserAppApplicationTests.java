package com.neu.userapp;

import com.neu.userapp.domain.User;
import com.neu.userapp.mapper.UserMapper;
import com.neu.userserviceapi.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserAppApplication.class)
class UserAppApplicationTests {

    @Resource
    UserMapper mapper;

    @Resource
    UserService service;

    @Test
    void contextLoads() {
    }


    @Test
    void insert() {
        User user = new User();
        user.setId(3);
        user.setUsername("李四");
        user.setAccount("123124");
        user.setAddress("北京");
        user.setPassword("12314");
        user.setRemark("无");
        user.setPhone("18671043093");
        user.setTelPhone("12332234234");
        user.setZipCode("sdasd");

        mapper.insert(user);
    }



}
