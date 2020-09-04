package com.hello.petshop.controller;

import com.hello.petshop.entity.TestUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testJSON {

    @ResponseBody
    @RequestMapping("/test2")
    public String test2(){
        TestUser user = new TestUser();
        user.setUserId(2);
        user.setUserName("jichi");
        user.setUserPwd("a123");
        String  reault= "["+user+"]";
        return reault;
    }
}