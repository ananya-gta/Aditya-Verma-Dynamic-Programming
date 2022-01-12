# What is 0-1 Knapsack Problem ?

Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. 
In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. 
Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. 
You cannot break an item, either pick the complete item or don’t pick it (0-1 property).

### :no_entry_sign: *Repetition of items is not allowed !!*

![image](https://user-images.githubusercontent.com/64327691/149123926-aeb4e95d-fc76-489a-88fd-33fe46a456e0.png)

### Code for 0-1 Knapsack Problem

```
class solution 
{
int knapsack(int wt[], int val[], int w, int n)
{
  int dp[][]= new int[n+1][w+1];
  for(int i=0; i<n+1; i++)
  {
      for(int j=0; j<w+1; j++)
      {
      // if bag's capacity is 0 or there are no items to be filled then there will be no profit
         if(i==0 || j==0) 
             return 0;
       }
  }
  for(int i=1; i<n+1; i++)
  {
      for(int j=1; j<w+1; j++)
      {
        if(wt[i-1] <=j)
           dp[i][j]= Math.max( dp[i-1][j] , val[i-1] + dp[i-1][j-wt[i-1]);
        else
           dp[i][j]= dp[i-1][j];
      }
  }
  return dp[n][w];
 }
}           
```
