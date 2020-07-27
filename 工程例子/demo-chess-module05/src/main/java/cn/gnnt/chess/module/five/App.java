package cn.gnnt.chess.module.five;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 主类(入口类)
 * SpringBootApplication 注解是一个组合注解，
 * 他包含：SpringBootConfiguration、EnableAutoConfiguration、CommponentScan
 * SpringBootConfiguration：相当于普通 Spring 中的 ApplicationContext，用于加载配置文件
 * EnableAutoConfiguration：开启自动化配置，使开发人员可以自定义配置
 * ComponentScan：进行包扫描，spring 扫描的包以主类所在包为根路径
 */
@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
