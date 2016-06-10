package com.twpathashala.game;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MinefieldInputParseTest {
    @Test
    public void categorizationShouldReturnTrueWhenEqualMinesArePassed(){
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        String input="xxx,xmx,xxx";
        Mine check=new Mine(set);
        MinefieldInputParse minefieldInputParse = new MinefieldInputParse(3, 3);
        Mine mine=minefieldInputParse.categorization(input);
        assertTrue(Arrays.deepEquals(check.getInput(),mine.getInput()));
    }

    @Test
    public void categorizationShouldReturnFalseWhenUnequalMinesArePassed(){
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        String input="xxx,mmx,xxx";
        Mine check=new Mine(set);
        MinefieldInputParse minefieldInputParse = new MinefieldInputParse(3, 3);
        Mine mine=minefieldInputParse.categorization(input);
        assertFalse(Arrays.deepEquals(check.getInput(),mine.getInput()));
    }
}