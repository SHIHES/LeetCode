package array;

/**
 * LeetCode #66
 * @author SHIHS 2023/1/31
 * @resource <a href="https://leetcode.com/problems/plus-one/solutions/2706861/java-fastest-0ms-runtime-easy-and-elegant-solution/?languageTags=java">...</a>
 */
public class PlusOne66 {

    /**
     * The loop starts from the last index and check the value is less than 9. If true, the element needs to plus one
     * and return, if not, set the element to 0 and move backward. If all elements have been set to 0 i.e. [0, 0, 0],
     * it means the original value is [9, 9, 9], then we can create a new int array with the first element set to 1 i.e.
     * [1, 0, 0, 0]
     * TC: O(n)
     * SC: O(n)
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
