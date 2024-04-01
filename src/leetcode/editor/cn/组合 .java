package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
  * 题目Id：77; 
  * 题目：组合，combinations; 
  * 日期：2024-03-27 15:07:20
*/

class 组合 {
    public static void main(String[] args) {
        Solution solution = new 组合().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), n, k, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> list, int n, int k, int nextStart) {
        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = nextStart;i<=n;i++){
            list.add(i);
            backtrack(result, list, n, k, i+1);
            list.remove(list.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
