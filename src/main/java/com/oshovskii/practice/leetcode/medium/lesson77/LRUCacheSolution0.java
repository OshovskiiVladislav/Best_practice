package com.oshovskii.practice.leetcode.medium.lesson77;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU Cache
 * https://leetcode.com/problems/lru-cache/
 */
class LRUCacheSolution0 extends LinkedHashMap<Integer, Integer> {

    private final int maxSize;

    public LRUCacheSolution0(int capacity) {
        super(capacity, 0.75F, true);
        this.maxSize = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > maxSize;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }
}
