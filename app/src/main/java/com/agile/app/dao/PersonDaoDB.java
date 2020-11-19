package com.agile.app.dao;

import com.agile.app.entity.Person;
import com.agile.app.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonDaoDB implements PersonDao {

   private final PersonRepository personRepository;

    @Override
    public void addPerson(Person person) {
        System.out.println("HELOOOOOOOOOO!!!!!!négy");
        System.out.println(personRepository);
        personRepository.save(person);
    }

    @Override
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }
}
