class Solution{
    static int SubsetSum(int N, int arr[], int sum){

        int dp[][] = new int[N + 1][sum + 1];
        for (int i = 0; i <= N; i++)
             dp[i][0] =1;

        for (int j = 1; j <= sum; i++)
            dp[0][j] = 0;
      
        for (int i = 1; i < N+1; i++)
        {
             for (int j = 1; j < sum+1; j++) 
             {
                 dp[i][j] = dp[i-1][j];
                 if (arr[1 - 1]<=j)
                     dp[i][j] = dp[i][j] + dp[i-1][j - arr[i - 1]];
             }
        }

/* // uncomment this code to print table
for (int i = 0; i <= sum; i++)
{
for (int j = 0; j <= n; j++)
System.out.println (subset[i][j]);
} */

      return dp[N][sum];

    }
}
