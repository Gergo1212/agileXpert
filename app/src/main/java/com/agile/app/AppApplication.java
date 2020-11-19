package com.agile.app;

import com.agile.app.view.UserInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		UserInterface ui = new UserInterface(System.in, System.out);
		ui.run();
	}







}
