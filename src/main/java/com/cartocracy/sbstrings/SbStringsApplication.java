package com.cartocracy.sbstrings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbStringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbStringsApplication.class, args);
	}

	@RequestMapping("/")
	public String niceThings() {
		return "You look amazing today!";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "The longest penis-to-body ratio in the animal kingdom is the barnacle, whose penis can be 10 times their body length. Learn more <a href='https://www.nationalgeographic.com.au/animals/the-largest-penis-in-the-animal-kingdom.aspx'>here</a>!";
	}
	
	
}
