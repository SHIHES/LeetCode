package Array;

import org.junit.Assert;
import org.junit.Test;

public class PlusOne66Test {

    @Test
    public void plusOneTest1() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 4};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void plusOneTest2() {
        int[] input = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void plusOneTest3() {
        int[] input = {9, 9};
        int[] expected = {1, 0, 0};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void plusOneTest4() {
        int[] input = {9,8,7,6,5,4,3,2,1,0};
        int[] expected = {9,8,7,6,5,4,3,2,1,1};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void plusOneTest5() {
        int[] input = {8,8,9};
        int[] expected = {8,9,0};
        int[] actual = PlusOne66.plusOne(input);
        Assert.assertArrayEquals(expected, actual);
    }
}
