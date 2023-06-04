package ru.gbjava.configzen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;



@SpringBootApplication
@EnableConfigServer
public class ConfigServerKinozen {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerKinozen.class, args);
    }

}
