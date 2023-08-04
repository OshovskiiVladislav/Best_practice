package com.oshovskii.practice.leetcode.medium.lesson70;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GasStationTest {
    GasStationSolution gasStationClass;

    @BeforeEach
    public void init() {
        gasStationClass = new GasStationSolution();
    }

    /**
     * Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
     * Travel to station 4. Your tank = 4 - 1 + 5 = 8
     * Travel to station 0. Your tank = 8 - 2 + 1 = 7
     * Travel to station 1. Your tank = 7 - 3 + 2 = 6
     * Travel to station 2. Your tank = 6 - 4 + 3 = 5
     * Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
     * Therefore, return 3 as the starting index.
     */
    @Test
    void GasStationTest_1() {
        // Config
        final var gas = new int[]{1, 2, 3, 4, 5};
        final var cost = new int[]{3, 4, 5, 1, 2};

        // Call and Verify
        assertEquals(3, gasStationClass.canCompleteCircuit(gas, cost));
    }

    /**
     * You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
     * Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
     * Travel to station 0. Your tank = 4 - 3 + 2 = 3
     * Travel to station 1. Your tank = 3 - 3 + 3 = 3
     * You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
     * Therefore, you can't travel around the circuit once no matter where you start.
     */
    @Test
    void GasStationTest_2() {
        // Config
        final var gas = new int[]{2, 3, 4};
        final var cost = new int[]{3, 4, 3};

        // Call and Verify
        assertEquals(-1, gasStationClass.canCompleteCircuit(gas, cost));
    }

    @Test
    void GasStationTest_3() {
        // Config
        final var gas = new int[]{2, 3, 4};
        final var cost = new int[]{3, 4, 3};

        // Call and Verify
        assertEquals(-1, gasStationClass.canCompleteCircuit(gas, cost));
    }
}
