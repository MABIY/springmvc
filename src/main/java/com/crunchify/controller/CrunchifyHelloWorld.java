package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuhua on 16-6-1.
 */
@Controller
public class CrunchifyHelloWorld {
        @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

            User user = User.builder().age(1).name("300").build();
            user.setAge(1);
            user.setId(1);
            String message = "<br><div style='text-align:center;'>"
                    + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********'"+ user.getAge()+"'</div><br><br>";
        return new ModelAndView("welcome","message",message);
    }
}
