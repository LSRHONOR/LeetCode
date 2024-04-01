package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目Id：47;
 * 题目：全排列 II，permutations-ii;
 * 日期：2024-04-01 13:13:10
 */

class 全排列II {
    public static void main(String[] args) {
        Solution solution = new 全排列II().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            int visited[] = new int[nums.length];
            backtrack(res, nums, new ArrayList<Integer>(), visited);
            return res;
        }

        private void backtrack(List<List<Integer>> res, int[] nums, ArrayList<Integer> arrayList, int[] visited) {
            if (arrayList.size() == nums.length) {
                if (res.contains(arrayList))
                    return;
                res.add(new ArrayList<Integer>(arrayList));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (visited[i] == 1)
                    continue;
                visited[i] = 1;
                arrayList.add(nums[i]);
                backtrack(res, nums, arrayList, visited);
                visited[i] = 0;
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
