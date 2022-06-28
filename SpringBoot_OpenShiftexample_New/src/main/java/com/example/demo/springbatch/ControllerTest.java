package com.example.demo.springbatch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerTest {

	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Hellow World";
	}
	@GetMapping("/{input}")
	public String getMessage(@PathVariable String input) {
		return "Hi Welcome "+input+" To the World";
	}
}
