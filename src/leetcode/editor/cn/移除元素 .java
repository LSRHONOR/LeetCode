package leetcode.editor.cn;

/**
  * 题目Id：27; 
  * 题目：移除元素，remove-element; 
  * 日期：2024-03-14 12:13:36
*/

class 移除元素 {
    public static void main(String[] args) {
        Solution solution = new 移除元素().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int slowIndex=0;
        for(int fastIndex = 0;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex]!=val){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
