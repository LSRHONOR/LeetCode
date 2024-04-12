package leetcode.editor.cn;

/**
  * 题目Id：63; 
  * 题目：不同路径 II，unique-paths-ii; 
  * 日期：2024-04-12 22:50:22
*/

class 不同路径II {
    public static void main(String[] args) {
        Solution solution = new 不同路径II().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        dp[0][0] = 1 - obstacleGrid[0][0];
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 0 && dp[0][i - 1] == 1)
                dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1)
                dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] != 0)
                    continue;
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
