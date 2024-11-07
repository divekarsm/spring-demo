package spring_demo.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	
	@GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot with Java 8!";
    }
	
	@GetMapping("/")
    public String hello1() {
        return "Hello, S1pring Boot with Java 8!";
    }

}
