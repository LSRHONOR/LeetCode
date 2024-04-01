package leetcode.editor.cn;

/**
  * 题目Id：977; 
  * 题目：有序数组的平方，squares-of-a-sorted-array; 
  * 日期：2024-03-14 12:35:55
*/

class 有序数组的平方 {
    public static void main(String[] args) {
        Solution solution = new 有序数组的平方().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int k = nums.length-1;
        for(int i=0,j=nums.length-1;i<=j;){
            if(nums[i]*nums[i]<nums[j]*nums[j]){
                ans[k]=nums[j]*nums[j];
                j--;
                k--;
            }else {
                ans[k]=nums[i]*nums[i];
                i++;
                k--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
