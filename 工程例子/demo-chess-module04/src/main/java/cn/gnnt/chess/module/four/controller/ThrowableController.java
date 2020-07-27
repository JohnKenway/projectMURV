package cn.gnnt.chess.module.four.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThrowableController {

    @GetMapping("/errorpage")
    public String errorpage(){
        return "spring boot four module errorpage!";
    }
}
