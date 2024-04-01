package leetcode.editor.cn;

/**
  * 题目Id：383; 
  * 题目：赎金信，ransom-note; 
  * 日期：2024-03-16 16:49:07
*/

class 赎金信 {
    public static void main(String[] args) {
        Solution solution = new 赎金信().new Solution();

        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(int i = 0;i<magazine.length();i++){
            count[magazine.charAt(i)-'a']++;
        }
        for(int i = 0;i<ransomNote.length();i++){
            count[ransomNote.charAt(i)-'a']--;
        }
        for(int i = 0;i<count.length;i++){
            if(count[i]<0)
                return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}
