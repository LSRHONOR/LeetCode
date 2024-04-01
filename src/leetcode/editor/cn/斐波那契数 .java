package leetcode.editor.cn;

/**
  * 题目Id：509; 
  * 题目：斐波那契数，fibonacci-number; 
  * 日期：2024-04-01 14:30:52
*/

class 斐波那契数 {
    public static void main(String[] args) {
        Solution solution = new 斐波那契数().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int fib(int n) {
        if(n==0||n==1) return n;

        return fib(n-1)+fib(n-2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
