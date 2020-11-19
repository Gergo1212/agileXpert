package com.agile.app.manager;

import com.agile.app.dao.PersonDao;
import com.agile.app.entity.Person;
import com.agile.app.view.UserInterface;
import org.springframework.stereotype.Service;


@Service
public class UserManager extends Manager {


    public UserManager(UserInterface ui, PersonDao personDao) {
        super(ui, personDao);
    }

    @Override
    protected void list() {
        for (Person person : personDao.getAllPeople()) {
            ui.println(person);
        }
    }

    @Override
    protected void add() {
        String name = ui.readString("Name", "type in your name please");
        personDao.addPerson(
                Person.builder()
                        .name(name)
                        .build());
    }
}
