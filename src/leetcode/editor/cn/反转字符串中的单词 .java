package leetcode.editor.cn;

/**
  * 题目Id：151; 
  * 题目：反转字符串中的单词，reverse-words-in-a-string; 
  * 日期：2024-03-23 13:12:12
*/

class 反转字符串中的单词 {
    public static void main(String[] args) {
        Solution solution = new 反转字符串中的单词().new Solution();
        System.out.println(solution.reverseWords("t "));
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.replaceAll("\\s+"," ").trim().split(" ");
        if (s1.length == 1)
            return s.trim();
        StringBuilder s2 = new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
            s2.append(s1[i]).append(" ");
        }
        return s2.toString().trim();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
