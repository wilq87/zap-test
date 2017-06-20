package com.loboss.test.zaptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ZaptestApplication {

	    @RequestMapping("/")
	    String home() {
		return "Hello World!";
	    }
	public static void main(String[] args) {
		SpringApplication.run(ZaptestApplication.class, args);
	}
}
