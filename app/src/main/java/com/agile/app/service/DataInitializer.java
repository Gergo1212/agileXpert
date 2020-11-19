package com.agile.app.service;

import com.agile.app.dao.ApplicationDao;
import com.agile.app.dao.PersonDao;
import com.agile.app.entity.Application;
import com.agile.app.entity.Person;
import com.agile.app.manager.UserManager;
import com.agile.app.view.UserInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final PersonDao personDao;
    private final UserManager userManager;
    private final UserInterface ui;
    private final ApplicationDao applicationDao;

    @Override
    public void run(String... args) throws Exception {

        dataCreator();
        mainMenuCreator();
    }


    private void dataCreator() {

        personDao.addPerson(
                Person.builder()
                        .name("Joe")
                        .build()
        );

        applicationDao.addApplication(
                Application.builder()
                        .name("GPS")
                        .build()
        );

        applicationDao.addApplication(
                Application.builder()
                        .name("Game 1")
                        .build());

        applicationDao.addApplication(
                Application.builder()
                        .name("Game 2")
                        .build());

        applicationDao.addApplication(
                Application.builder()
                        .name("CookBook")
                        .build());

    }


    private void mainMenuCreator() {
        boolean running = true;

        while (running) {
            ui.printTitle("Main Menu");
            ui.printOption('u', "Users");
            ui.printOption('a', "Add new User");
            ui.printOption('q', "Quit");
            switch (ui.choice("uq")) {
                case 'u':
                    userManager.run();
                    break;
                case 'a':

                case 'q':
                    running = false;
                    break;
            }
        }
    }
}
