class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num: nums) sum+= num;
        if(sum%2!=0) return false;
        else return subset_sum(nums, sum/2, nums.length);
    }
    public static boolean subset_sum(int nums[], int sum, int n)
    {
        boolean dp[][]= new boolean[n+1][sum+1];
        for(int i=0; i<n+1; i++)
            for(int j=0; j<sum+1; j++)
            {
               if(i==0) dp[i][j]=false;
                else dp[i][j]= true;
            }
        for(int i=1; i<n+1; i++)
            for(int j=1; j<sum+1; j++)
            {
                if(nums[i-1]<=j)
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-nums[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        return dp[n][sum];
    }
}
