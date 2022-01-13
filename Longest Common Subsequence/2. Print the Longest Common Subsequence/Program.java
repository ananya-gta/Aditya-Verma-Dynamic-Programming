// Dynamic Programming implementation of LCS problem in Java
import java.io.*;
 
class  LongestCommonSubsequence
{
    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    static void lcs(String X, String Y, int m, int n)
    {
        int[][] t = new int[m+1][n+1];
  
        // Following steps build L[m+1][n+1] in bottom up fashion. Note
        // that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    t[i][j] = t[i-1][j-1] + 1;
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
      StringBuilder sb= new StringBuilder();
      int i=n, j=m;
      while(i>0 && j>0)
      {
        if(X.charAt(i-1) == Y.charAt(j-1))
        {
          sb.append(X.charAt(i-1));
          i--;
          j--;
        }
        else if(t[i][j-1] > t[i-1][j])
          j--;
        else
          i--;  
      }
      sb.reverse();
      return sb.toString();
    }
}
        
  
