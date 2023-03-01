package Array;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArray26Test {

    @Test
    public void removeDuplicatesTest1() {
        int[] input = {1, 1, 2};
        int expected = 2;
        int[] expectedArray = {1, 2, 2};
        int actual = RemoveDuplicatesFromSortedArray26.removeDuplicates(input);
        Assert.assertEquals(expected, actual);
        Assert.assertArrayEquals(expectedArray, input);
    }

    @Test
    public void removeDuplicatesTest2() {
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expected = 5;
        int[] expectedArray = {0, 1, 2, 3, 4, 2, 2, 3, 3, 4};
        int actual = RemoveDuplicatesFromSortedArray26.removeDuplicates(input);
        Assert.assertEquals(expected, actual);
        Assert.assertArrayEquals(expectedArray, input);
    }
}
