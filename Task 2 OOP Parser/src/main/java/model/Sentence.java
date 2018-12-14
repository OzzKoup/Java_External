package model;


import java.util.List;

public class Sentence {
    private String sentence;
    private static List<Word> word;
    private int length;

    public static List<Word> getWord() {
        return word;
    }

    public static void setWord(List<Word> word) {
        Sentence.word = word;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static String[] getSentences(String string) {
        String[] chars = Word.getWords(string);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i] + " ");
        }
        String[] sentences = stringBuilder.toString().split("\\.");
        return sentences;
    }
}
