package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 * <code>LoginController</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 11/7/2022
 **/
@RestController
@RequestMapping("/test")
public class LoginController {
    @PostMapping("/test01")
    public String addRelease(@RequestBody Map<String, Object> payload){
        System.out.println(payload);
        System.out.println("Test");
        return "Success";
    }
}
