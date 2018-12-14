package com.transport.view;

import com.transport.controller.Controller;
import com.transport.controller.Filter;
import com.transport.model.VehicleGenerator;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class Printer {
    private static Scanner scanner = new Scanner(System.in);
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("text");
    private static Locale locale;

    public void start() throws UnsupportedEncodingException {

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
            System.out.println(Controller.theLessPriceTheFastestNotOlder5years(VehicleGenerator.getAllVehicle()));
        }
        if (number == 2) {
            String option = resourceBundle.getString("option_two");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);
            System.out.println(Controller.findHeightMorThan5000and2000(VehicleGenerator.getAllVehicle()));
        }
        if (number == 3) {
            String option = resourceBundle.getString("option_three");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);
            System.out.println(Controller.findSpeedBetween(VehicleGenerator.getAllVehicle()));
        }
        if (number == 4) {
            String option = resourceBundle.getString("option_four");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);
            System.out.println(VehicleGenerator.addCars());
        }
        if (number == 5) {
            String option = resourceBundle.getString("option_five");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result);

            option = resourceBundle.getString("option_five_one");
            result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result + VehicleGenerator.getMoveble());

            option = resourceBundle.getString("option_five_two");
            result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result + VehicleGenerator.getFlyable());

            option = resourceBundle.getString("option_five_three");
            result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result + VehicleGenerator.getSwimable());
        }
        if (number == 6) {
            String option = resourceBundle.getString("option_six_two");
            String result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result + Filter.findTheFastest(VehicleGenerator.getFlyable()));

            option = resourceBundle.getString("option_six_one");
            result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result + Filter.findTheFastest(VehicleGenerator.getMoveble()));

            option = resourceBundle.getString("option_six_three");
            result = new String(option.getBytes("cp1252"), "cp1251");
            System.out.println(result + Filter.findTheFastest(VehicleGenerator.getSwimable()));
        }
    }


}
