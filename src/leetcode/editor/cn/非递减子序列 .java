package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
  * 题目Id：491; 
  * 题目：非递减子序列，non-decreasing-subsequences; 
  * 日期：2024-03-31 17:00:30
*/

class 非递减子序列 {
    public static void main(String[] args) {
        Solution solution = new 非递减子序列().new Solution();
        int nums[] = {4,4,3,2,1};
        System.out.println(solution.findSubsequences(nums));
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums, 0);
        return result;
    }
    private void backTracking(int[] nums, int startIndex){
        if(path.size() >= 2)
            result.add(new ArrayList<>(path));
        HashSet<Integer> hs = new HashSet<>();
        for(int i = startIndex; i < nums.length; i++){
            if(!path.isEmpty() && path.get(path.size() -1 ) > nums[i] || hs.contains(nums[i]))
                continue;
            hs.add(nums[i]);
            path.add(nums[i]);
            backTracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
