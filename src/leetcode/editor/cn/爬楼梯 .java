package leetcode.editor.cn;

/**
  * 题目Id：70; 
  * 题目：爬楼梯，climbing-stairs; 
  * 日期：2024-04-04 23:02:10
*/

class 爬楼梯 {
    public static void main(String[] args) {
        Solution solution = new 爬楼梯().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int a = 1, b = 2, sum = 0;

        for(int i = 3; i <= n; i++){
            sum = a + b;  // f(i - 1) + f(i - 2)
            a = b;        // 记录f(i - 1)，即下一轮的f(i - 2)
            b = sum;      // 记录f(i)，即下一轮的f(i - 1)
        }
        return b;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
