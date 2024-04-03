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
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
