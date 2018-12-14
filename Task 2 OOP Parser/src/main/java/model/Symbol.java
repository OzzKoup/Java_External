package model;

public class Symbol {
  private char[] symbols;

    public char[] getSymbols() {
        return symbols;
    }

    public void setSymbols(char[] symbols) {
        this.symbols = symbols;
    }

    public static char[] getSymbols(String text) {
        char[] chars = text.toCharArray();
        return chars;
    }
}