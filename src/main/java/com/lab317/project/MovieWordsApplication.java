/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */

package com.lab317.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MovieWordsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieWordsApplication.class, args);
    }
}
