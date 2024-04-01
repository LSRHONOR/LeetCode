package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
  * 题目Id：523; 
  * 题目：连续的子数组和，continuous-subarray-sum; 
  * 日期：2024-03-18 17:30:01
*/

class 连续的子数组和 {
    public static void main(String[] args) {
        Solution solution = new 连续的子数组和().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            sum = (sum+nums[i])%k;
            if(map.containsKey(sum)){
                int pre = map.get(sum);
                if(i - pre >=2){
                    return true;
                }
            }else{
                map.put(sum, i);
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
