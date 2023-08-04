package com.oshovskii.practice.yandex.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoodLineTest {

    @Test
    void checkGoodLine2() {
        Integer expectedValue = 2;
        assertEquals(expectedValue, GoodLine.checkGoodLine(3, 1, 1, 1));
    }

    @Test
    void checkGoodLine1() {
        Integer expectedValue = 3;
        assertEquals(expectedValue, GoodLine.checkGoodLine(2, 3, 4));
    }
}
