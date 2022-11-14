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
        System.out.println("create new branch <jalen>, commit code to this branch");
        System.out.println("repeat commit to branch <jalen>");
        return "Success";
    }

    @GetMapping("/test02")
    public String test02(){
        System.out.println("test02");
        return "success";
    }
}
