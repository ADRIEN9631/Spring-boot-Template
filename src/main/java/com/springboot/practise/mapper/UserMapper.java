package com.springboot.practise.mapper;

import com.springboot.practise.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;


public interface UserMapper {
    int deleteByPrimaryKey(Integer iduser);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer iduser);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}