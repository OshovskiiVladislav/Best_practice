package com.oshovskii.practice.leetcode.easy.lesson75;

import com.oshovskii.practice.leetcode.easy.lesson75.TwoOutOfThreeSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class TwoOutOfThreeTest {
    private TwoOutOfThreeSolution twoOutOfThreeClass;

    @BeforeEach
    public void init() {
        twoOutOfThreeClass = new TwoOutOfThreeSolution();
    }


    @Test
    void twoOutOfThreeClass_1() {
        // Config
        final var nums1 = new int[]{1, 1, 3, 2};
        final var nums2 = new int[]{2, 3};
        final var nums3 = new int[]{3};

        final var expectedOutput = List.of(3, 2);

        // Call and Verify
        List<Integer> actual = twoOutOfThreeClass.twoOutOfThree(nums1, nums2, nums3);

        assertThat("List is not matching",
                actual, containsInAnyOrder(expectedOutput.toArray()));

    }

    @Test
    void twoOutOfThreeClass_2() {
        // Config
        final var nums1 = new int[]{3, 1};
        final var nums2 = new int[]{2, 3};
        final var nums3 = new int[]{1, 2};

        final var expectedOutput = List.of(2, 3, 1);

        // Call and Verify
        List<Integer> actual = twoOutOfThreeClass.twoOutOfThree(nums1, nums2, nums3);

        assertThat("List is not matching",
                actual, containsInAnyOrder(expectedOutput.toArray()));
    }

    @Test
    void twoOutOfThreeClass_3() {
        // Config
        final var nums1 = new int[]{1, 2, 2};
        final var nums2 = new int[]{4, 3, 3};
        final var nums3 = new int[]{5};

        final var expectedOutput = List.of();

        // Call and Verify
        List<Integer> actual = twoOutOfThreeClass.twoOutOfThree(nums1, nums2, nums3);

        assertThat("List is not matching",
                actual, containsInAnyOrder(expectedOutput.toArray()));

    }
}
