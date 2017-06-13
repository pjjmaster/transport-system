package com.siemens.transport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TransportSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportSystemApplication.class, args);
	}
}


@RestController
class Service{
	
	@RequestMapping("getMessage")
	public String getMessage(){
		return "Hi";
	}
	
}