package com.oshovskii.practice.leetcode.medium.lesson77;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LRUCacheSolution0Test {


    @Test
    void verifyingAnAlienDictionary_solution_0() {
        // Config
        LRUCacheSolution0 lruCacheClass = new LRUCacheSolution0(2);

        // Call and Verify
        lruCacheClass.put(1, 1);    // cache is {1=1}
        lruCacheClass.put(2, 2);    // cache is {1=1, 2=2}

        assertEquals(1, lruCacheClass.get(1));


        lruCacheClass.put(3, 3);    // LRU key was 2, evicts key 2, cache is {1=1, 3=3}

        assertEquals(-1, lruCacheClass.get(2));

        lruCacheClass.put(4, 4);    // LRU key was 1, evicts key 1, cache is {4=4, 3=3}

        assertEquals(-1, lruCacheClass.get(1));
        assertEquals(3, lruCacheClass.get(3));
        assertEquals(4, lruCacheClass.get(4));
    }

    @Test
    void verifyingAnAlienDictionary_solution_1() {
        // Config
        LRUCacheSolution1 lruCacheClass = new LRUCacheSolution1(2);

        // Call and Verify
        lruCacheClass.put(1, 1);    // cache is {1=1}
        lruCacheClass.put(2, 2);    // cache is {1=1, 2=2}

        assertEquals(1, lruCacheClass.get(1));


        lruCacheClass.put(3, 3);    // LRU key was 2, evicts key 2, cache is {1=1, 3=3}

        assertEquals(-1, lruCacheClass.get(2));

        lruCacheClass.put(4, 4);    // LRU key was 1, evicts key 1, cache is {4=4, 3=3}

        assertEquals(-1, lruCacheClass.get(1));
        assertEquals(3, lruCacheClass.get(3));
        assertEquals(4, lruCacheClass.get(4));
    }

    @Test
    void verifyingAnAlienDictionary_solution_2() {
        // Config
        LRUCacheSolution2 lruCacheClass = new LRUCacheSolution2(2);

        // Call and Verify
        lruCacheClass.put(1, 1);    // cache is {1=1}
        lruCacheClass.put(2, 2);    // cache is {1=1, 2=2}

        assertEquals(1, lruCacheClass.get(1));


        lruCacheClass.put(3, 3);    // LRU key was 2, evicts key 2, cache is {1=1, 3=3}

        assertEquals(-1, lruCacheClass.get(2));

        lruCacheClass.put(4, 4);    // LRU key was 1, evicts key 1, cache is {4=4, 3=3}

        assertEquals(-1, lruCacheClass.get(1));
        assertEquals(3, lruCacheClass.get(3));
        assertEquals(4, lruCacheClass.get(4));
    }

}
