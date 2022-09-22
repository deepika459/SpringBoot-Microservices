package com.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethod {
	
	@GetMapping("/userfallback")
	public String userFallBack() {
		
		return "User service is taking longer than expected";	}
	
	@GetMapping("/departmentfallback")
	public String departmentFallBack() {
		
		return "department service is taking longer than expected";	}

}
