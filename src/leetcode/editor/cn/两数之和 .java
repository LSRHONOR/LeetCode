package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
  * 题目Id：1; 
  * 题目：两数之和，two-sum; 
  * 日期：2024-03-16 12:48:09
*/

class 两数之和 {
    public static void main(String[] args) {
        Solution solution = new 两数之和().new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[1] = i;
                res[0] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
