# Problem statement 

Given two strings str1 and str2, return the length of the shortest string that has both str1 and str2 as subsequences.

## Example:

*Input:* 

s1= AGGTAB
s2= GXTXAYB

*Output:* 9

*Explanation:* The smallest supersequence is AGGXTXAYB.

### LOGIC:

Find the length of the longest common subsequence.
Sum the length of both the strings.
The difference of the two gives us the length of the shortest supersequence.

