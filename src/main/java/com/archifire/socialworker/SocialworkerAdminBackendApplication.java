package com.archifire.socialworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SocialworkerAdminBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialworkerAdminBackendApplication.class, args);
	}
}
