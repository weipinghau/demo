package com.example.demo.controller;

import com.example.demo.bean.Car;
import com.example.demo.bean.Person;
import com.example.demo.model.UserDomain;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private Person person;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
    @ResponseBody
    @PostMapping("/hello")
    public String sayHello(){
        return "person:"+person;
    }


    @Value("${car.width}")
    private String width;


    @ResponseBody
    @PostMapping("/car")
    public String sayCar(){
        return "car.width:"+width;
    }
}
