package com.agile.app.manager;

import com.agile.app.dao.ApplicationDao;
import com.agile.app.dao.PersonDao;
import com.agile.app.entity.Application;
import com.agile.app.entity.Person;
import com.agile.app.view.UserInterface;
import org.springframework.stereotype.Service;


@Service
public class UserManager extends Manager {


    public UserManager(UserInterface ui, PersonDao personDao, ApplicationDao applicationDao) {
        super(ui, personDao, applicationDao);
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

    @Override
    protected void addApplicationToUser() {
        Integer userId = ui.readInt("UserId", 0);
        Person person = personDao.findPersonById(userId);
        Integer applicationId = ui.readInt("ApplicationId", 0);
        Application application = applicationDao.findAppById(applicationId);
        person.addApp(application);
    }
}
