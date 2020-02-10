package com.hebeicloud.cultivationweather.waterproof;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hebeicloud.cultivationweather.waterproof.dao")
public class WaterproofApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterproofApplication.class, args);
    }

}
