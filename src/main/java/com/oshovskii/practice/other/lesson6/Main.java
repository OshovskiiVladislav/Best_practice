package com.oshovskii.practice.other.lesson6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public Map<Integer, Integer> calculateRepeats(List<Integer> input) {

        Map<Integer, Integer> map = new HashMap<>();

        if (input == null || input.isEmpty()) {
            return map;
        }

        for (Integer e1 : input) {
            if (map.containsKey(e1)) {
                map.put(e1, map.get(e1) + 1);
            } else {
                map.put(e1, 1);
            }
        }
        return map;
    }
}

