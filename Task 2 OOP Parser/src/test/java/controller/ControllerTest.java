package controller;

import model.Word;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ControllerTest {
    @Test
    public void testSortWithSpecialSymbolsAndLetters() {
        List<String> expected = Arrays.asList("общее", "априори", "если", "Очень");
        String sentence = "Очень дорого можно купить общее +s колличество,/f           если деньги будут априори там .";
        String[] text = Word.getWords(sentence);
        String[] actual = Controller.sort(text);
        List<String> actualList = new ArrayList<>();
        for (String s : actual) {
            actualList.add(s);

        }
        assertEquals(expected, actualList);
    }

    @Test
    public void testSort() {
        List<String> expected = Arrays.asList("общее", "априори", "если", "Очень");
        String sentence = "Очень дорого можно купить общее колличество, если деньги будут априори там";
        String[] text = Word.getWords(sentence);
        String[] actual = Controller.sort(text);
        List<String> actualList = new ArrayList<>();
        for (String s : actual) {
            actualList.add(s);

        }
        assertEquals(expected, actualList);
    }
}
