package com.yuzi.oauth2.server;

import com.yuzi.oauth2.server.utils.MyMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.yuzi.oauth2"},excludeFilters = {@ComponentScan.Filter(MyMapper.class)})
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }

}
