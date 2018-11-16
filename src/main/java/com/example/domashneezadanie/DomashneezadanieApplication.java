package com.example.domashneezadanie;

import com.example.domashneezadanie.model.Message;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Message.class)
@MapperScan("com.example.domashneezadanie.mapper")
@SpringBootApplication
public class DomashneezadanieApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomashneezadanieApplication.class, args);
    }
}
