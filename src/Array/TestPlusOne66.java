package Array;

import org.junit.Assert;
import org.junit.Test;

public class TestPlusOne66 {

    @Test
    public void PlusOneTest1() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 4};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void PlusOneTest2() {
        int[] input = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void PlusOneTest3() {
        int[] input = {9, 9};
        int[] expected = {1, 0, 0};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void PlusOneTest4() {
        int[] input = {9,8,7,6,5,4,3,2,1,0};
        int[] expected = {9,8,7,6,5,4,3,2,1,1};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void PlusOneTest5() {
        int[] input = {8,8,9};
        int[] expected = {8,9,0};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }
}
