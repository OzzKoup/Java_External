package view;

import controller.Controller;
import controller.Parser;
import model.Sentence;
import model.Word;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Printer {
    private static Scanner scanner = new Scanner(System.in);
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("text");
    private static Locale locale;
    private static final String TEXT = Parser.getText();

    public void start() throws IOException {
        System.out.println("Enter your language/Введите язык");
        System.out.println("1 - English " + "\n" + "2 - Русский" + "\n");
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            locale = new Locale("US", "US");
            resourceBundle = ResourceBundle.getBundle("text", locale);
            String str = resourceBundle.getString("menu");
            System.out.println(str);
        } else {
            locale = new Locale("RU", "RU");
            resourceBundle = ResourceBundle.getBundle("text", locale);
            String str = resourceBundle.getString("menu");
            String news = new String(str.getBytes("cp1252"), "cp1251");
            System.out.println(news);
        }
        number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            String option = resourceBundle.getString("option_one");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);
            Controller.printText(Sentence.getSentences(TEXT));
        }
        if (number == 2) {
            String option = resourceBundle.getString("option_two");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);
            Controller.printText(Controller.sort(Word.getWords(TEXT)));
        }
    }
}
