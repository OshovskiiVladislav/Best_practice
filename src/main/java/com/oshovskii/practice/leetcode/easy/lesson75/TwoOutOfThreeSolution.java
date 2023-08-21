package com.oshovskii.practice.leetcode.easy.lesson75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2032 Two Out of Three
 * https://leetcode.com/problems/two-out-of-three/description/
 */
public class TwoOutOfThreeSolution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> setNum1 = new HashSet<>(nums1.length * 2);
        for (int num : nums1) {
            setNum1.add(num);
        }

        Set<Integer> setNum2 = new HashSet<>(nums2.length * 2);
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (setNum1.contains(num) && !setNum2.contains(num)) {
                result.add(num);
            }
            setNum2.add(num);
        }

        for (int num : nums3) {
            if (!result.contains(num) && (setNum1.contains(num) || setNum2.contains(num))) {
                result.add(num);
            }
        }

        return result;
    }
}
