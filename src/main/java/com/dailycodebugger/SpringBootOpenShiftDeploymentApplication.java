package com.dailycodebugger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/App")
public class SpringBootOpenShiftDeploymentApplication {

	@GetMapping("/getMessage")
	public String getMessage() {

		return "Hello World!!";

	}

	@GetMapping("/{user}")
	public String congrats(@PathVariable("user") String user) {
		return "Hello " + user + " your application is deployed successfully on the Openshift container!!! Thanks";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpenShiftDeploymentApplication.class, args);
	}

}
