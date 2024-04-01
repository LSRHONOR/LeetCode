package leetcode.editor.cn;

import java.util.Arrays;

/**
  * 题目Id：455; 
  * 题目：分发饼干，assign-cookies; 
  * 日期：2024-04-01 14:06:47
*/

class 分发饼干 {
    public static void main(String[] args) {
        Solution solution = new 分发饼干().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 思路1：优先考虑饼干，小饼干先喂饱小胃口
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length && start < g.length; i++) {
            if (s[i] >= g[start]) {
                start++;
                count++;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
