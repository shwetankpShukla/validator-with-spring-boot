package com.spider.api.rest;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spider.api.dto.Person;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@GetMapping("/msg")
	private String get() {
		return "swagger-ui.html";
	}
	
	@PostMapping("/person")
	  ResponseEntity<String> validateBody(@Valid @RequestBody Person input) {
	    return ResponseEntity.ok("valid");
	  }

}
