package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
  * 题目Id：349; 
  * 题目：两个数组的交集，intersection-of-two-arrays; 
  * 日期：2024-03-15 15:14:00
*/

class 两个数组的交集 {
    public static void main(String[] args) {
        Solution solution = new 两个数组的交集().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0){
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i:nums1){
            set1.add(i);
        }
        for (int i : nums2){
            if(set1.contains(i))
                set2.add(i);
        }

        return set2.stream().mapToInt(x->x).toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
