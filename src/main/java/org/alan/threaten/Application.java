package org.alan.threaten;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
//	@RequestMapping("/")
//	public String greeting() {
//		return "Hello World!";
//	}
//	@PostMapping("/login")
//	public void login(@RequestBody Map<String,Object> reqMap){
//	    String tel = reqMap.get("sign").toString();
//	    System.out.println(tel);
//	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
