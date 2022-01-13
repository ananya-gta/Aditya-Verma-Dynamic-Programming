
class Solution 
{ 
    int minDeletions(String str, int n)
    {
        // code here
        StringBuilder sb= new StringBuilder(str);
        String rev= sb.reverse().toString();
        
        int t[][]= new int[n+1][n+1];
        
        for(int i=0; i<n+1; i++)
            for(int j=0; j<n+1; j++)
            {
                if(i==0 || j==0)
                    t[i][j]=0;
                else if(str.charAt(i-1)==rev.charAt(j-1))
                    t[i][j]= 1+ t[i-1][j-1];
                else
                    t[i][j]= Math.max(t[i][j-1], t[i-1][j]);
            }
        
        return n-t[n][n];
    }
} 
