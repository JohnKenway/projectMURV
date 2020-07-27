package cn.gnnt.chess.module.six.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    @GetMapping("/error")
    public String error(){
        return "ooh the implements of service is error!";
    }
}
