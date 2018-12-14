package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Parser {
    public static String getText() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fis = new FileInputStream("Data.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"))) {
            do {
                stringBuilder.append(br.readLine());
            } while (br.readLine() != null);
            stringBuilder.toString().replaceAll("\\s+", " ");
            return stringBuilder.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
