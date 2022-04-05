package ru.learnUp.feb.learnupjava20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Learnupjava20Application {

    private static final Logger log = LoggerFactory.getLogger(Learnupjava20Application.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Learnupjava20Application.class, args);

        Game.gameProcess(context);

    }

}
