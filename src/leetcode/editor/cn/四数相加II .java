package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
  * 题目Id：454; 
  * 题目：四数相加 II，4sum-ii; 
  * 日期：2024-03-16 13:10:45
*/

class 四数相加II {
    public static void main(String[] args) {
        Solution solution = new 四数相加II().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for (int i : nums3) {
            for (int j : nums4) {
                res += map.getOrDefault(-i - j, 0);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
