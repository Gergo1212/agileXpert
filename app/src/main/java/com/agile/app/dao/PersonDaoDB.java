package com.agile.app.dao;

import com.agile.app.entity.Person;
import com.agile.app.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonDaoDB implements PersonDao {

   private final PersonRepository personRepository;

    @Override
    public void addPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @Override
    public Person findPersonById(Integer id) {
        return personRepository.findById(id).orElse(null);
    }

}
