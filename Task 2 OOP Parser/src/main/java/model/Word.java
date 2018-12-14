package model;

import java.util.List;

public class Word {
    private String word;
    private int lenght;
    private static List<Symbol> symbol;

    public int getLenght() {
        return lenght;
    }

    public static List<Symbol> getSymbol() {
        return symbol;
    }

    public static void setSymbol(List<Symbol> symbol) {
        Word.symbol = symbol;
    }

    public static String[] getWords(String text) {
        char[] chars = Symbol.getSymbols(text);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
        }
        String[] strings = stringBuilder.toString().trim().replaceAll("\\s+", " ").split(" ");
        return strings;
    }
}
