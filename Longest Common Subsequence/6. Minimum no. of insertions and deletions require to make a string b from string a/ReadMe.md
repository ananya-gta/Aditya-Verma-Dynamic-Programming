# Problem Statement

Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.

In one step, you can delete exactly one character in either string.

 

### Example 1:

Input: word1 = "sea", word2 = "eat"

Output: 2

Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".

### Example 2:

Input: word1 = "leetcode", word2 = "etco"

Output: 4

#LOGIC:

                      "heap"----------------->"pea"
	                       \                    /
		                    \                  /     
      2 deletions            \                /          1 insertion is required          
	 are required             \              /                to make "pea" from 
	  to make "ea"             \            /                        "ea".  
      from "heap"               \          / 
								 \        /
								    "ea"
	


                                
       ### Total Modifications required = Insertion + Deletion
