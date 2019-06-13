package com.sls;

import cn.gjing.core.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger
public class ThreadDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThreadDemoApplication.class, args);
    }

}
