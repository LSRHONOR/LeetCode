package leetcode.editor.cn;

/**
  * 题目Id：209; 
  * 题目：长度最小的子数组，minimum-size-subarray-sum; 
  * 日期：2024-03-14 12:52:24
*/

class 长度最小的子数组 {
    public static void main(String[] args) {
        Solution solution = new 长度最小的子数组().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,left=0,result=Integer.MAX_VALUE;
        for(int right = 0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                result = Math.min(result,right-left+1);
                sum-=nums[left];
                left++;

            }
        }
        return result == Integer.MAX_VALUE?0:result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
