package com.gx.hjt_crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gx.hjt_crm.mapper")
@SpringBootApplication
public class HjtCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(HjtCrmApplication.class, args);
    }

}
