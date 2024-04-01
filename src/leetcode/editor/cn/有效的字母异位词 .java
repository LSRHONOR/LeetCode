package leetcode.editor.cn;

/**
  * 题目Id：242; 
  * 题目：有效的字母异位词，valid-anagram; 
  * 日期：2024-03-15 14:54:28
*/

class 有效的字母异位词 {
    public static void main(String[] args) {
        Solution solution = new 有效的字母异位词().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] count = new int[26];
        for(int i = 0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i = 0;i<count.length;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
