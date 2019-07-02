package com.yuzi.oauth2.server;


import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AuthorizationTest {
//    public static void main(String[] args) {
//        System.out.println(new BCryptPasswordEncoder().encode("secret"));
//    }

    @Test
    public void test1(){
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
