package com.neu.userserviceapi.service;


import com.neu.userserviceapi.DTO.UserDTO;

public interface UserService {

    /**
     * 通过用户id获取用户信息接口
     * @param id
     * @return  User 的替代品 UserVO
     */
    public UserDTO getUserById(Integer id);
}
