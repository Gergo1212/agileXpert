package com.agile.app.manager;

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

    public void run() {
        boolean running = true;

        while (running) {
            ui.printTitle("Menu");
            ui.printOption('l', "List Users");
            ui.printOption('q', "Quit");

            switch (ui.choice("lq")) {
                case 'l':
                    list();
                    break;
                case 'q':
                    running = false;
                    break;
            }
        }
    }

    protected abstract void list();
}
