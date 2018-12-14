package view;

import controller.Controller;
import model.ModelWriter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Printer {
    private static Scanner scanner = new Scanner(System.in);
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("text");
    private static Locale locale;

    public void start() throws IOException {
        System.out.println("Enter your language/Выберите язык");
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
            System.out.println(Controller.countPassengerAmount(ModelWriter.getTrain()));
        }
        if (number == 2) {
            String option = resourceBundle.getString("option_two");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);
            System.out.println(Controller.countBaggageAmount(ModelWriter.getTrain()));
        }
        if (number == 3) {
            String option = resourceBundle.getString("option_three");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);
            System.out.println(Controller.sortComfortOfRailwayCarriage(ModelWriter.getTrain()));
        }
        if (number == 4) {
            String option = resourceBundle.getString("option_four");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);
            int from = Integer.parseInt(scanner.nextLine());
            int after = Integer.parseInt(scanner.nextLine());
            System.out.println(Controller.findAmountOfPassengerInCarriage(ModelWriter.getTrain(), from,after));
        }
    }
}
