package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
  * 题目Id：3; 
  * 题目：无重复字符的最长子串，longest-substring-without-repeating-characters; 
  * 日期：2024-03-13 14:51:34
*/

class 无重复字符的最长子串 {
    public static void main(String[] args) {
        Solution solution = new 无重复字符的最长子串().new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcdabce"));
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        int max = 0, left = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
