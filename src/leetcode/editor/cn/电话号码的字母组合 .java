package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
  * 题目Id：17; 
  * 题目：电话号码的字母组合，letter-combinations-of-a-phone-number; 
  * 日期：2024-03-29 12:16:35
*/

class 电话号码的字母组合 {
    public static void main(String[] args) {
        Solution solution = new 电话号码的字母组合().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    String [] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return ans;
        }
        backtrack(ans, digits, 0, new StringBuilder());
        return ans;
    }

    private void backtrack(List<String> ans,  String digits, int i, StringBuilder stringBuilder) {
        if(digits.length()==stringBuilder.length()){
            ans.add(stringBuilder.toString());
            return;
        }
        for(int j=0;j<map[digits.charAt(i)-'0'].length();j++){
            stringBuilder.append(map[digits.charAt(i)-'0'].charAt(j));
            backtrack(ans, digits, i+1, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
