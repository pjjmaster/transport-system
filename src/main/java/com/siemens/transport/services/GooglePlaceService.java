package com.siemens.transport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GooglePlaceService {

	@Value("${googleplacesapi}")
	private String placeApi; 
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/getPlace")
	public String getPlace(){
		
		String response = restTemplate.getForObject(placeApi, String.class);
		return response;
	}
	
	
}
