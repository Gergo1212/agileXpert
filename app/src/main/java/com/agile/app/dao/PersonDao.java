package com.agile.app.dao;

import com.agile.app.entity.Person;

import java.util.List;

public interface PersonDao {

    void addPerson(Person person);

    List<Person> getAllPeople();

    Person findPersonById(Integer id);
}
