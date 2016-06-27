package com.crunchify.controller;

import com.lh.dao.JdbcCorporateEventDao;
import com.lh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by liuhua on 16-6-1.
 */
@RestController
public class CrunchifyHelloWorld {

    @Autowired
    JdbcCorporateEventDao jdbcCorporateEventDao;

    @Autowired
    UserMapper userMapper;
        @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

            User user = new User();
            user.setAge(1);
            user.setId(1);
            String message = "<br><div style='text-align:center;'>"
                    + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********'"+ user.getAge()+"'</div><br><br>";
        return new ModelAndView("welcome","message",message);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public   User  getUser() {
        User user = new User();
        user.setId( jdbcCorporateEventDao.countOfActorsByFirstName());
        return user;
    }

    //mybatis xml 配置测试
    @RequestMapping(value = "/mybatis/{id}",method = RequestMethod.GET)
    public User getUserBymabits(@PathVariable long id) {
        return userMapper.getUser(id);
    }
}
