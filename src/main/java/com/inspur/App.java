package com.inspur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * 将启动的代码抽取出来,更符合规范
 * 这是一种启动方式!(两个注解)
 *      @EnableAutoConfiguration
 *      @ComponentScan
 *
 * 另外一种启动的方式:
 * 使用@SpringBootApplication 就代替了以上的两种注解
 *
 */
//@EnableAutoConfiguration
//@ComponentScan("com.inspur")//缺点:如果扫包,会有很多包需要扫描
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
