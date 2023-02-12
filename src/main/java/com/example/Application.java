package com.example;
/**
 * @author  GuYang
 * @date  2022/02/09
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.example.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println(">>>>>>启动成功啦>>>>>> \n"+
                "后台启动网址:http://localhost:8888/end/page/login.html \n"+
                "前台启动网址:http://localhost:8888/front/index.html \n");
    }
}