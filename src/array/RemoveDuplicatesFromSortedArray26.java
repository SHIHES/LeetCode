package array;

/**
 * LeetCode #26
 *
 * @author SHIHS 2023/2/1
 * @resource <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/solutions/2601915/remove-duplicates-from-sorted-array/">...</a>
 */
public class RemoveDuplicatesFromSortedArray26 {

    /**
     * The input array will be well-sorted increasingly. So we can use two index to record the specific position.
     * The first index is used to get the insert position, the second index is used to traverse the loop.
     * TC: O(n)
     * SC: O(1)
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            // We skip to next index if we see a duplicate element
            if (nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
