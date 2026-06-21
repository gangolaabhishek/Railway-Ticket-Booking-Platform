
package com.railway.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication

//Q: What does @EnableConfigServer do?
//A: It converts a Spring Boot application into a centralized configuration 
// server that can serve configuration files to multiple microservices from 
// a Git repository or local file system.
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
