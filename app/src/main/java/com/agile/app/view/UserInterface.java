package com.agile.app.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInterface {
    Scanner scanner;
    PrintStream printStream;

    public UserInterface(InputStream in, PrintStream out) {
        this.scanner = new Scanner(in);
        this. printStream = out;
    }

    public void printOption(char option, String description) {
        printStream.println("(" + option + ")" + " " + description);
    }

    public void printTitle(String title) {
        printStream.println("\n -- " + title + " --");
    }

    public char choice(String options) {
        String line;
        do {
            printStream.print("Choice [" + options + "]: ");
            line = scanner.nextLine();
        } while (!(line.length() == 1 && options.contains(line)));
        return line.charAt(0);
    }

}

