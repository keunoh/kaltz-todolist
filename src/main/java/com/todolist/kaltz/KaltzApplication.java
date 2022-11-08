package com.todolist.kaltz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class KaltzApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaltzApplication.class, args);
	}

}
