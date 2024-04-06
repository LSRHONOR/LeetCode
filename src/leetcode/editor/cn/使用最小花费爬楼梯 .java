package leetcode.editor.cn;

/**
  * 题目Id：746; 
  * 题目：使用最小花费爬楼梯，min-cost-climbing-stairs; 
  * 日期：2024-04-06 23:29:45
*/

class 使用最小花费爬楼梯 {
    public static void main(String[] args) {
        Solution solution = new 使用最小花费爬楼梯().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        //最后一步，如果是由倒数第二步爬，则最后一步的体力花费可以不用算
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
