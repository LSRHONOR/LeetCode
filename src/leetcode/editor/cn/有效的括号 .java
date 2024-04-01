package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

/**
  * 题目Id：20; 
  * 题目：有效的括号，valid-parentheses; 
  * 日期：2024-03-23 00:03:02
*/

class 有效的括号 {
    public static void main(String[] args) {
        Solution solution = new 有效的括号().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char ch;
        for(int i = 0;i<s.length();i++){
            ch = s.charAt(i);
            if(ch=='('){
                stack.push(')');
            } else if (ch=='{') {
                stack.push('}');
            } else if (ch=='[') {
                stack.push(']');
            }else if (stack.isEmpty() || stack.peek() != ch) {
                return false;
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
