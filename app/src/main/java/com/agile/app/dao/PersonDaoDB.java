package com.agile.app.dao;

import com.agile.app.entity.Person;
import com.agile.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonDaoDB implements PersonDao{

    UserRepository userRepository;


    @Override
    public Person addPerson(Person person) {
        return null;
    }
}
