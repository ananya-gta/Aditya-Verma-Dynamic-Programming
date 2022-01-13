# Problem Statement

Given a string 'str' of size ‘n’. The task is to remove or delete the minimum number of characters from the string so that the resultant string is a palindrome. Find the minimum numbers of characters we need to remove.
Note: The order of characters should be maintained.

### Example 1:

Input: n = 7, str = "aebcbda"

Output: 2

Explanation: We'll remove 'e' and
'd' and the string become "abcba".

### Example 2:

Input: n = 3, str = "aba"

Output: 0

Explanation: We don't remove any
character.

# Logic

ans= length of the given string - length o fthe longest palindromic subsequence 
