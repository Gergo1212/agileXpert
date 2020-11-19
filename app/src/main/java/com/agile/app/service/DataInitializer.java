package com.agile.app.service;

import com.agile.app.dao.PersonDao;
import com.agile.app.entity.Person;
import com.agile.app.manager.Manager;
import com.agile.app.manager.UserManager;
import com.agile.app.view.UserInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final PersonDao personDao;
    private final UserManager userManager;
    private final UserInterface ui;

    @Override
    public void run(String... args) throws Exception {
        personDao.addPerson(
                Person.builder()
                        .name("Joe")
                        .build()
        );
      mainMenuCreator();
    }


    private void mainMenuCreator(){
        boolean running = true;

        while (running) {
            ui.printTitle("Main Menu");
            ui.printOption('u', "Users");
            ui.printOption('q', "Quit");
            switch (ui.choice("uq")) {
                case 'u':
                    userManager.run();
                    break;
                case 'q':
                    running = false;
                    break;
            }
        }}
}
