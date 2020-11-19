package com.agile.app;

import com.agile.app.view.UserInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppApplication {

	UserInterface ui;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		UserInterface ui = new UserInterface(System.in, System.out);
		new AppApplication(ui).run();
	}

	private void run() {
		boolean running = true;

		while (running) {
			ui.printTitle("Main Menu");
			ui.printOption('u', "Users");
			ui.printOption('r', "New User");
			ui.printOption('q', "Quit");
			switch (ui.choice("urq")) {
				case 'a':
					System.out.println("a");
					break;
				case 'b':
					System.out.println("b");
					break;
				case 'q':
					running = false;
					break;
			}
		}
	}


}
