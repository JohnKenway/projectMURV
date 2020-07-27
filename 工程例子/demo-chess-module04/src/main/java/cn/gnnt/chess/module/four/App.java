package cn.gnnt.chess.module.four;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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

        /*
         * 这里如果需要关闭 banner 打印，或执行一些骐达的操作
         * 可以用 SpringApplicationBuilder 替换 ApringApplication
         * 进行一定的设置后再启动服务
         */
        /*
        SpringApplicationBuilder builder = new SpringApplicationBuilder(App.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
        */
    }
}
