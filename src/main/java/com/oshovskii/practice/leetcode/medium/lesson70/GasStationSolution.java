package com.oshovskii.practice.leetcode.medium.lesson70;

import java.util.Arrays;

/**
 * 134. Gas Station
 * https://leetcode.com/problems/gas-station/
 */
public class GasStationSolution {

    public int canCompleteCircuitOptimize(int[] gas, int[] cost) {
        int total = 0, avail = 0, index = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            avail += gas[i] - cost[i];
            if (avail < 0) {
                avail = 0;
                index = i + 1;
            }
        }
        if (total < 0) {
            return -1;
        }
        return index;
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ringLength = gas.length;

        int sumGas = Arrays.stream(gas).sum();
        int sumCost = Arrays.stream(cost).sum();

        if (sumGas < sumCost) {
            return -1;
        }

        for (int stationIndex = 0; stationIndex < ringLength; stationIndex++) {
            if ((gas.length > stationIndex + 1) && (gas[stationIndex] == cost[stationIndex])) {
                continue;
            }
            int result = canCompleteCircuitRecursive(stationIndex, ringLength, gas, cost);
            if (result != -1) {
                return result;
            }
        }
        return -1;
    }

    public static int canCompleteCircuitRecursive(int startStationIndex, int ringLength, int[] gas, int[] cost) {
        int currentGas = 0;
        for (int i = startStationIndex; ; ) {
            currentGas += gas[i];
            currentGas = currentGas - cost[i];
            if (currentGas < 0) {
                return -1;
            }
            if (i + 1 == startStationIndex) {
                break;
            }
            if (i == ringLength - 1) {
                if (startStationIndex == 0) {
                    return startStationIndex;
                }
                i = 0;
            } else if (i < ringLength) {
                i++;
            }
        }
        return startStationIndex;
    }

}
