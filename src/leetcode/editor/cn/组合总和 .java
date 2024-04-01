package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
  * 题目Id：39; 
  * 题目：组合总和，combination-sum; 
  * 日期：2024-03-29 13:00:49
*/

class 组合总和 {
    public static void main(String[] args) {
        Solution solution = new 组合总和().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,0,0);
        return ans;
    }

    private void backtrack(int[] candidates, int target, int sum,int idx) {
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx;i<candidates.length;i++) {
            if (sum + candidates[i] > target) break;
            list.add(candidates[i]);
            backtrack(candidates, target,sum+candidates[i],i);
            list.remove(list.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
