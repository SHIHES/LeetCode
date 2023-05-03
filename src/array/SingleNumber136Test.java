package array;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber136Test {

    @Test
    public void SingleNumberTest1() {
        int[] nums = {2,2,0, 0, 3};
        int expected = 3;
        int actual = SingleNumber136.singleNumber(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SingleNumberTest2() {
        int[] nums = {4,1,2,1,2};
        int expected = 4;
        int actual = SingleNumber136.singleNumber(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SingleNumberTest3() {
        int[] nums = {1};
        int expected = 1;
        int actual = SingleNumber136.singleNumber(nums);
        Assert.assertEquals(expected, actual);
    }
}
