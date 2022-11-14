package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/test03")
    public String test03(){
        System.out.println("master add code");
        return "success";
    }
}
