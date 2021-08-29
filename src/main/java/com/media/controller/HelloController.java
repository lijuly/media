package com.media.controller;

import com.media.UserDto;
import com.media.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(path="media")
public class HelloController {

    @Autowired
    private IAccountService service;

    @RequestMapping(path = "/hello")
    public @ResponseBody Map<String, String> sayHello(){
        Map<String, String> result = new HashMap();
        result.put("info","hello , ni hao!");
        result.put("userName","李兵");
        result.put("age","20");
        service.findAll();
        return result;
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(UserDto user){
        System.out.println(user.toString());
        return "success";
    }

    @RequestMapping(value="testRequestParam")
    public String testRequestParam(@RequestParam(value="name")String userName){
        System.out.println(userName);
        return "success";
    }

    @RequestMapping(value="/getJson")
    public void getJson(HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        Map<String, String> result = new HashMap();
        //result.put("info","hello , ni hao!");
        result.put("userName","李兵");
        result.put("age","20");
        try {
            response.getWriter().write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
