package cn.gnnt.chess.module.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot 主类(入口类)
 *
 * EnableAutoConfiguration 表示开启自动化配置
 * 开启了自动化配置后，会自动装载 spring-boot-starter-web
 * 从而进行 spring 和 springMVC 配置
 *
 * ComponentScan 表示扫描包
 * 因为要扫描路径下生成的 Controller 类
 * 所以需要配置本项注解
 *
 * 以上 EnableAutoConfiguration、ComponentScan
 * 两个注解可以用 SpringBootApplication 代替
 */
//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
