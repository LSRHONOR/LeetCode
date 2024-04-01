package leetcode.editor.cn;

/**
  * 题目Id：376; 
  * 题目：摆动序列，wiggle-subsequence; 
  * 日期：2024-04-01 14:21:01
*/

class 摆动序列 {
    public static void main(String[] args) {
        Solution solution = new 摆动序列().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        //当前差值
        int curDiff = 0;
        //上一个差值
        int preDiff = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            //得到当前差值
            curDiff = nums[i] - nums[i - 1];
            //如果当前差值和上一个差值为一正一负
            //等于0的情况表示初始时的preDiff
            if ((curDiff > 0 && preDiff <= 0) || (curDiff < 0 && preDiff >= 0)) {
                count++;
                preDiff = curDiff;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
