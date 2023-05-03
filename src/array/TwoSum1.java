package array;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #1
 * @author SHIHS 2023/1/31
 * @resource <a href="https://leetcode.com/problems/two-sum/solutions/127810/two-sum/">...</a>
 */
public class TwoSum1 {
    /**
     * By using double for loops to traverse the array. The second array checks
     * the elements excluding the first array and compares with the expected number.
     * If true, add the first array [i] item and the second array [i] item to the list.
     * TC: O(n ^ 2)
     * SC: O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int now = 0; now < len; now += 1) {
            for (int compare = now + 1; compare < len; compare += 1) {
                if (nums[compare] + nums[now] == target) {
                    return new int[]{now, compare};
                }
                // Start from the back, check the numbers
                if (nums[len - now - 1] + nums[len - compare -1] == target) {
                    return new int[] {len - compare - 1, len - now -1};
                }
            }
        }
        return null;
    }

    /**
     * Iterating elements into hash table, and also look back to check if current element's complement
     * already exists in the hash table.
     * TC: O(n)
     * SC: O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumWithHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
