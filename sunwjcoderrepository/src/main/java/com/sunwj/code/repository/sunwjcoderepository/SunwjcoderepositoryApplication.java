package com.sunwj.code.repository.sunwjcoderepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SunwjcoderepositoryApplication {

    public static void main(String[] args) {

        SpringApplication.run(SunwjcoderepositoryApplication.class, args);

        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanConfig.class);
        applicationContext.getBean(Teacher.class).teach();*/
    }

}
