package com.oshovskii.practice.leetcode.easy.lesson67;
import org.junit.Assert;
import org.junit.Test;
public class UglyNumberSolutionTest {

    UglyNumberSolution uglyNumberClass = new UglyNumberSolution();


    @Test
    public void UglyNumberTest() {
        Assert.assertEquals(false, uglyNumberClass.isUgly(14));

        Assert.assertEquals(true, uglyNumberClass.isUgly(8));

        Assert.assertEquals(false, uglyNumberClass.isUgly(-2147483648));

        Assert.assertEquals(true, uglyNumberClass.isUgly(9));
    }
}
