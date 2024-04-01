package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
  * 题目Id：78; 
  * 题目：子集，subsets; 
  * 日期：2024-03-31 16:50:37
*/

class 子集 {
    public static void main(String[] args) {
        Solution solution = new 子集().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, 0);
        return ans;
    }

    private void backTracking(int[] nums, int startIndex) {
        ans.add(new ArrayList<>(path));
        if(startIndex >= nums.length)return;
        for(int i = startIndex;i<nums.length;i++){
            path.add(nums[i]);
            backTracking(nums, i+1);
            path.remove(path.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
