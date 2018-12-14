package controller;

import org.apache.log4j.Logger;

import java.util.*;


public class Controller {
    private static final Logger logger = Logger.getLogger(Controller.class);

    public static String[] sort(String[] words) {
        logger.info("Enter method sort with words : " + words);
        String string[] = findWordsStartsFromVowelsLetters(words);
        Collections.sort(Arrays.asList(string), new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() > 1 && s2.length() > 1) {
                    return s1.charAt(1) - s2.charAt(1);
                }
                return -1;
            }
        });
        logger.info("Enter method sort() with words : " + words);
        return string;
    }

    public static void printText(String[] text) {
        logger.info("Enter method prineText() with text : " + text);
        for (String s: text) {
            System.out.println(s);
        }
    }

    private static String[] findWordsStartsFromVowelsLetters(String [] words) {
        logger.info("Enter method findWordsStartsFromVowelsLetters() with words : " + words);
        char[] vowels = {'а', 'е', 'и', 'о', 'э', 'я', 'у', 'А', 'Е', 'И', 'О', 'У', 'Э', 'Я'};
        List<String> list = new ArrayList<>();
        int i = 0;
        for (String s : words) {
            for (Character c : vowels) {
                if (s.charAt(0) == c.charValue()) {
                    list.add(s);
                    i++;
                }
            }
        }
        String[] foundedWords = new String[i];
        i = 0;
        for (String s: list) {
            foundedWords[i++] = s;
        }
        logger.info("Exit method findWordsStartsFromVowelsLetters() with words : " + foundedWords);
        return foundedWords;
    }
}
