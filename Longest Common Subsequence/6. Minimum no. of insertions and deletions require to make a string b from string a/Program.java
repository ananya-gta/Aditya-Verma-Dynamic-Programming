public class Solution {
    public int minDistance(String s1, String s2) {
        int n= s1.length();
        int m=s2.length();
        
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) 
        {
            for (int j = 0; j <= m; j++) 
            {
                if (i == 0 || j == 0)
                    continue;
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        int insert= m-dp[n][m];
        int delete= n-dp[n][m];
        return insert + delete ;
    }
}
