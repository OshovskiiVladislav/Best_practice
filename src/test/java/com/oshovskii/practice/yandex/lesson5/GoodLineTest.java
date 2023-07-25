package com.oshovskii.practice.yandex.lesson5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodLineTest {

    @Test
    public void checkGoodLine2() {
        Integer expectedValue = 2;
        assertEquals(expectedValue, GoodLine.checkGoodLine(3, 1, 1, 1));
    }

    @Test
    public void checkGoodLine1() {
        Integer expectedValue = 3;
        assertEquals(expectedValue, GoodLine.checkGoodLine(2, 3, 4));
    }
}
