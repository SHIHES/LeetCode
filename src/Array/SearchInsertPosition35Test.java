package Array;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPosition35Test {

    @Test
    public void searchInsertPositionTest1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int expected = 2;
        int actual = SearchInsertPosition35.solution(nums, target);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchInsertPositionTest2() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int expected = 1;
        int actual = SearchInsertPosition35.solution(nums, target);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchInsertPositionTest3() {
        int[] nums = {1,3,5,6};
        int target = 0;
        int expected = 0;
        int actual = SearchInsertPosition35.solution(nums, target);
        Assert.assertEquals(expected, actual);
    }
}
