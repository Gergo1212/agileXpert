package com.agile.app.manager;

import com.agile.app.dao.ApplicationDao;
import com.agile.app.dao.PersonDao;
import com.agile.app.view.UserInterface;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@Service
@RequiredArgsConstructor
public abstract class Manager {

    final UserInterface ui;

    final PersonDao personDao;

    final ApplicationDao applicationDao;



    public void run() {
        boolean running = true;

        while (running) {
            ui.printTitle("Menu");
            ui.printOption('l', "List Users");
            ui.printOption('a', "Add new User");
            ui.printOption('e', "Add application to User");
            ui.printOption('q', "Quit");

            switch (ui.choice("laeq")) {
                case 'l':
                    list();
                    break;
                case 'a':
                    add();
                    break;
                case 'e':
                    addApplicationToUser();
                    break;
                case 'q':
                    running = false;
                    break;
            }
        }
    }

    protected abstract void list();

    protected abstract void add();

    protected abstract void addApplicationToUser();
}
