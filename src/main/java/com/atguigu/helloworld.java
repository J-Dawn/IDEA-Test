package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication 标注一个主程序类，代表是springboot应用

@SpringBootApplication
public class helloworld {

    public static void main(String[] args) {

        //启动spring应用
        SpringApplication.run(helloworld.class,args);
    }
}
