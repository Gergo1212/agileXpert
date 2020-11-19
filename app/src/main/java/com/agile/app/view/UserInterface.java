package com.agile.app.view;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.PrintStream;
import java.util.Scanner;

@Service
@AllArgsConstructor

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);

    private final PrintStream printStream = new PrintStream(System.out);


    public void println(Object obj) {
        printStream.println(obj);
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

    private void printPrompt(String prompt, Object defaultValue) {
        System.out.print(prompt + " [" + defaultValue + "]: ");
    }

    public String readString(String prompt, String defaultValue) {
        printPrompt(prompt, defaultValue);
        String line = scanner.nextLine();
        return line.isEmpty() ? defaultValue : line;
    }

    public int readInt(String prompt, int defaultValue) {
        while (true) {
            printPrompt(prompt, defaultValue);
            String line = scanner.nextLine();

            if (line.isEmpty())
                return defaultValue;

            try {
                return Integer.parseInt(line);
            } catch (IllegalArgumentException e) {
                printStream.println("Enter an integer!");
            }
        }
    }
}



