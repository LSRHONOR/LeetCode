package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
  * 题目Id：40; 
  * 题目：组合总和 II，combination-sum-ii; 
  * 日期：2024-03-29 13:24:44
*/

class 组合总和II {
    public static void main(String[] args) {
        Solution solution = new 组合总和II().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates==null||candidates.length==0)return ans;
        Arrays.sort(candidates);
        backtrace(candidates,target,0,0,list);
        return ans;
    }

    private void backtrace(int[] candidates, int target, int index, int sum, List<Integer> list) {
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(sum+candidates[i]>target)break;
            if(i>index&&candidates[i]==candidates[i-1])continue;
            sum+=candidates[i];
            list.add(candidates[i]);
            backtrace(candidates,target,i+1,sum,list);
            sum-=candidates[i];
            list.remove(list.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
