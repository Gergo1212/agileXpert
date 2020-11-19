package com.agile.app.manager;

import com.agile.app.view.UserInterface;


public abstract class Manager {

    UserInterface ui;

    public Manager(UserInterface ui) {
        this.ui = ui;
    }

    public void run() {
        boolean running = true;

        while (running) {
            ui.printTitle("Menu");
            ui.printOption('l', "List");
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
