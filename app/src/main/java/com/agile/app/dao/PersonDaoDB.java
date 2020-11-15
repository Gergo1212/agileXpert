package com.agile.app.dao;

import com.agile.app.entity.Person;
import com.agile.app.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonDaoDB implements PersonDao {

    PersonRepository personRepository;


    @Override
    public Person addPerson(Person person) {
        personRepository.saveAndFlush(person);
        return person;
    }
}
