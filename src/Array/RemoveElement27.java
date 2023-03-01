package Array;

public class RemoveElement27 {
    static int solution(int[] nums, int target) {
        // 用兩個指針來解，第一個指針指可以swap的位置
        int position = 0;
        int[] test = new int[90];

        // 第二個指針用來遍歷整個數列
        for(int i = 0; i < nums.length; i++){
            // 當不相等時，為獨特數字，將他移至數列前方，第一指針++
            if(nums[i] != target) {
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
}
