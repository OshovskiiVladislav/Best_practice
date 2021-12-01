package com.oshovskii.practice.other.lesson4;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collect {

    public static <K, V> Map<V, Collection<K>> inverse(Map<? extends K, ? extends V> map) {
        Map<V, Collection<K>> superMap = new HashMap<>();
        for (K k : map.keySet()) {
            V value2 = map.get(k);
            superMap.compute(value2, (V, KS) -> {
                if (KS == null) KS = new HashSet<>();
                KS.add(k);
                return KS;
            });
        }
        return superMap;
    }
}
