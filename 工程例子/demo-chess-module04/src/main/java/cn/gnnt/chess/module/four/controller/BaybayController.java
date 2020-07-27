package cn.gnnt.chess.module.four.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaybayController {

    @GetMapping("/baybay")
    public String baybay(){
        return "baybay spring boot four module!";
    }
}
