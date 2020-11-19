package com.agile.app.service;

import com.agile.app.dao.PersonDao;
import com.agile.app.entity.Person;
import com.agile.app.manager.Manager;
import com.agile.app.manager.UserManager;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final PersonDao personDao;
    private final UserManager manager;

    @Override
    public void run(String... args) throws Exception {
        personDao.addPerson(
                Person.builder()
                        .name("Joe")
                        .build()
        );
        manager.run();

    }
}
