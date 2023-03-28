package ru.IP_LabWorks.IP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class IpApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpApplication.class, args);
	}
}