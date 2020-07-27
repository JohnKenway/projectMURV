package cn.gnnt.chess.module.four.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        if(this != null){
            throw new RuntimeException("故意抛出异常");
        }
        return "hello spring boot four module!";
    }
}
