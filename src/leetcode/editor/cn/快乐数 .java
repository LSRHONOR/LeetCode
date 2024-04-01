package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
  * 题目Id：202; 
  * 题目：快乐数，happy-number; 
  * 日期：2024-03-15 15:20:55
*/

class 快乐数 {
    public static void main(String[] args) {
        Solution solution = new 快乐数().new Solution();
        System.out.println(solution.isHappy(19));
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> ans = new HashSet<>();
        while (n!=1&&!ans.contains(n)){
            ans.add(n);
            int res = 0;
            while (n>0){
                int temp = n%10;
                res += temp*temp;
                n = n/10;
            }
            n=res;
        }
        return n==1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
