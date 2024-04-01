package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
  * 题目Id：46; 
  * 题目：全排列，permutations; 
  * 日期：2024-04-01 13:07:11
*/

class 全排列 {
    public static void main(String[] args) {
        Solution solution = new 全排列().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums);
        return ans;
    }

    private void backtrack(int[] nums) {
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int num : nums) {
            if (list.contains(num)) {
                continue;
            }
            list.add(num);
            backtrack(nums);
            list.remove(list.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
