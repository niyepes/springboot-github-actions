package com.nicolas.yepes.springboot_github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubActionsApplication.class, args);
	}

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot with GitHub Actions!";
    }

    @GetMapping("/saludo")
    public String saludo() { return "Saludos, dale like y suscríbete"; }

}


