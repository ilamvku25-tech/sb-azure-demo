package com.sb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbAzureDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "congrats ! your app successfully deployed in Azure";
	}

	public static void main(String[] args) {

		SpringApplication.run(SbAzureDemoApplication.class, args);
	}

}
