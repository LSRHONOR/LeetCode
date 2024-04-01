package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
  * 题目Id：90; 
  * 题目：子集 II，subsets-ii; 
  * 日期：2024-03-31 16:57:34
*/

class 子集II {
    public static void main(String[] args) {
        Solution solution = new 子集II().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTracking(nums, 0);
        return ans;
    }

    private void backTracking(int[] nums, int startIndex) {
        ans.add(new ArrayList<>(path));
        for(int i = startIndex;i<nums.length;i++){
            if(i>startIndex&&nums[i]==nums[i-1])continue;
            path.add(nums[i]);
            backTracking(nums, i+1);
            path.remove(path.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
