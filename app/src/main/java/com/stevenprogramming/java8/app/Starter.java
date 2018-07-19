package com.stevenprogramming.java8.app;

import com.stevenprogramming.java8.domain.Employee;
import com.stevenprogramming.java8.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

@ComponentScan("com.stevenprogramming.java8")
@SpringBootApplication
public class Starter {

    public static void main(String[] args){
        SpringApplication.run(Starter.class, args);
    }
}
