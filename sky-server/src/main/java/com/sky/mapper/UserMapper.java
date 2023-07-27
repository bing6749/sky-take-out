package com.sky.mapper;
/*
 * @author  MaRui
 * @date  2023/7/27 16:10
 * @version 1.0
 */


import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author MaRui
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where openid = #{openid}")
    User getByOpenId(String openid);


    void insert(User user);
}
