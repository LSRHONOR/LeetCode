package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
  * 题目Id：LCR 010; 
  * 题目：和为 K 的子数组，QTMn0o; 
  * 日期：2024-03-18 17:15:32
*/

class 和为K的子数组 {
    public static void main(String[] args) {
        Solution solution = new 和为K的子数组().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0)return 0;
        int sum=0;
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += num;
            count += map.getOrDefault(sum - k, 0);
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
