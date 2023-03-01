package Array;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
    }

    static int solution(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        // 處理極大值case
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        // 處理極小值case
        if (nums[0] > target) {
            return 0;
        }

        // 處理大小介於數列之間的case
        while (left <= right) {
            int middle = left / 2 + right / 2;

            if (nums[middle] == target) {
                // 切成一半，剛好中間等於target
                return middle;
            } else if (nums[middle] < target) {
                // 左極限消失，表示目標值插入後將成為新的middle
                if (middle == left) {
                    return left + 1;
                }
                // 目標大於中間值，偏右，將左極限改成中間值
                left = middle;
            } else if (nums[middle] > target) {
                // 右極限消失，表示目標值插入後將成為新的middle
                if (middle == right) {
                    return right - 1;
                }
                // 目標小於中間值，偏左，將右極限改成中間值
                right = middle;
            }
        }
        // 回傳什麼都行
        return -100;
    }
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
