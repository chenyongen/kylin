package com.yuzi.mirror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.yuzi.mirror.dao")
public class OAuth2MirrorApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2MirrorApplication.class,args);
    }
}
