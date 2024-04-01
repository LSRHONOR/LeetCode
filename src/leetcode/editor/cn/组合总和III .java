package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
  * 题目Id：216; 
  * 题目：组合总和 III，combination-sum-iii; 
  * 日期：2024-03-27 15:51:15
*/

class 组合总和III {
    public static void main(String[] args) {
        Solution solution = new 组合总和III().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        dfs(list, new ArrayList<Integer>(), k, n, 0, 0);
        return list;
    }

    void dfs(List<List<Integer>> list, ArrayList<Integer> arrayList, int k, int n, int sum, int index) {
        if (sum > n || arrayList.size() > k)
            return;
        if (sum == n && arrayList.size() == k) {
            List<Integer> list1 = new ArrayList<>(arrayList);
            Collections.sort(list1);
            if (!list.contains(list1))
                list.add(list1);
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (i <= index)
                continue;
            index = i;
            arrayList.add(i);
            sum += i;
            dfs(list, arrayList, k, n, sum, index);
            sum -= i;
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
