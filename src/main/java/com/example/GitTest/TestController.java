package com.example.GitTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String main(){
        System.out.println(1111111);
        System.out.println(222222222);
        System.out.println(33333);
        return "main";
    }
}
