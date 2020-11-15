package com.agile.app.service;

import com.agile.app.dao.PersonDao;
import com.agile.app.entity.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@AllArgsConstructor
public class DataInitializer {

    PersonDao personDao;

    @PostConstruct
    private void init() {
        personDao.addPerson(
                Person.builder()
                        .name("Jolanda")
                        .build()
        );
    }
}
