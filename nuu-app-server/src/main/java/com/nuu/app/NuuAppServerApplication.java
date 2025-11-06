package com.nuu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "${nuu.base.package-name}")
public class NuuAppServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NuuAppServerApplication.class, args);
    }

}
