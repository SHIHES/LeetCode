package array;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElement27Test {

    @Test
    public void RemoveElementTest1() {
        int[] nums = {2, 3};
        int target = 2;
        int expected = 1;
        int actual = RemoveElement27.solution(nums, target);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RemoveElementTest2() {
        int[] nums = {0, 0, 0, 7, 0};
        int target = 0;
        int expected = 1;
        int actual = RemoveElement27.solution(nums, target);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RemoveElementTest3() {
        int[] nums = {3, 1, 2, 3, 4, 3, 3};
        int target = 3;
        int expected = 3;
        int actual = RemoveElement27.solution(nums, target);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RemoveElementTest4() {
        int[] nums = {2};
        int target = 2;
        int expected = 0;
        int actual = RemoveElement27.solution(nums, target);
        Assert.assertEquals(expected, actual);
    }
}
