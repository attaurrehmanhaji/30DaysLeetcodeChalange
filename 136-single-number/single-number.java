
class Solution {
     int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

public class singleNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 1, 2, 88, 88, 9 };
        System.out.println(solution.singleNumber(nums)); 
    }
}
