package com.lh.mapper;

import com.crunchify.controller.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liuhua on 16-6-27.
 */
public interface UserMapper {
    @Select("select * from user WHERE id = #{id}")
    User getUser(@Param("id") long id);
}
