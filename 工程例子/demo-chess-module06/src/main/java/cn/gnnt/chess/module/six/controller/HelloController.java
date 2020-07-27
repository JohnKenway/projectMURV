package cn.gnnt.chess.module.six.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot six module!";
    }

    /**
     * 访问方式 http://localhost/lili/hello
     * @param name
     * @param model
     * @return
     */
    @GetMapping("{name}/hello")
    public String helloUser(@PathVariable("name") String name, Model model){
        model.addAttribute("hello "+name);
        model.addAttribute("message","hello"+name);
        return "你好"+name;
    }

    /**
     * 访问方式 http://localhost/hellouser?name=lili
     * @param name
     * @param model
     * @return
     */
    @RequestMapping(value="/hellouser",method = RequestMethod.GET)
    public String helloUser2(@RequestParam("name") String name, Model model){
        model.addAttribute("hello "+name);
        model.addAttribute("message","hello"+name);
        return "你好"+name;
    }
}
