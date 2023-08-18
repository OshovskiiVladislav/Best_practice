package com.oshovskii.practice.leetcode.medium.lesson74;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PopulatingNextRightPointersInEachNodeTest {

    private PopulatingNextRightPointersInEachNodeSolution populatingNextRightPointersInEachNodeClass;

    @BeforeEach
    public void init() {
        populatingNextRightPointersInEachNodeClass = new PopulatingNextRightPointersInEachNodeSolution();
    }

    @Test
    void connect_test_2() {
        // Config
        // Input: root = [] | Output: []
        final var sourceInput = new Node();
        final var expectedOutput = new Node();

        // Call and Verify
        assertEquals(expectedOutput ,populatingNextRightPointersInEachNodeClass.connect(sourceInput));
    }

}
