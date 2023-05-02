package Array;

public class SingleNumber136 {

    /**
     * XOR 的位元運算方式
     * 0 ^ 0 = 0
     * 1 ^ 1 = 0
     * 1 ^ 0 = 1
     * 0 ^ 1 = 1
     *
     * 題目規定重複數字會出現兩次，因此透過 XOR 運算可以將對應的位元抵銷轉成0
     * EX: 5: 101   5(101) ^ 5(101) = 0(000)
     * 抵銷完就會得到答案
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int result = 0; // 初始值
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i]; // 利用XOR来找出出現一次的元素
        }
        return result;
    }
}
