package com.locationweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
 @Controller
public class Locationweb8Application {

	@GetMapping("/show3")
	public String showLocationPage() {
		return "create_Location";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Locationweb8Application.class, args);
	}

}
