package com.nuu.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @Author Suyi
 * @Date 2025/11/2
 **/
@RestController
public class test {

    @RequestMapping("/test")
    public String test1(){
        System.out.println("tes111");
        return "tes111t";
    }

}
