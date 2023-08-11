package com.oshovskii.practice.leetcode.easy.lesson73;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyingAnAlienDictionaryTest {

    private VerifyingAnAlienDictionarySolution verifyingAnAlienDictionaryClass;

    @BeforeEach
    public void init() {
        verifyingAnAlienDictionaryClass = new VerifyingAnAlienDictionarySolution();
    }


    @Test
    void verifyingAnAlienDictionary_1() {
        // Config
        final var words = new String[]{"hello", "leetcode"};
        final var order = "hlabcdefgijkmnopqrstuvwxyz";

        // Call and Verify
        assertTrue(verifyingAnAlienDictionaryClass.isAlienSorted(words, order));
    }

    @Test
    void verifyingAnAlienDictionary_2() {
        // Config
        final var words = new String[]{"word", "world", "row"};
        final var order = "worldabcefghijkmnpqstuvxyz";

        // Call and Verify
        assertFalse(verifyingAnAlienDictionaryClass.isAlienSorted(words, order));
    }

    @Test
    void verifyingAnAlienDictionary_3() {
        // Config
        final var words = new String[]{"apple","app"};
        final var order = "abcdefghijklmnopqrstuvwxyz";

        // Call and Verify
        assertFalse(verifyingAnAlienDictionaryClass.isAlienSorted(words, order));
    }

}
