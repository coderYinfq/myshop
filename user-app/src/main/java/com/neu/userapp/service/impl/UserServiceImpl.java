package com.neu.userapp.service.impl;


import com.neu.userapp.domain.User;
import com.neu.userapp.mapper.UserMapper;
import com.neu.userserviceapi.DTO.UserDTO;
import com.neu.userserviceapi.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDTO getUserById(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        UserDTO userDTO = new UserDTO();

        //将 user 转成 userDTO
        BeanUtils.copyProperties(user,userDTO);
        return userDTO;
    }


}
