package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * <code>LogOffController</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 11/14/2022
 **/
@RequestMapping("/demo")
public class LogOffController {
    @GetMapping("/demo01")
    public String logOff(){
        System.out.println("write code in main branch");
        return "123";
    }
}
