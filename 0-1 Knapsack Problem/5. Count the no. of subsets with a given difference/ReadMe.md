# PROBLEM STATEMENT:

You are given an array and a difference, We need to find how many subsets are there in the array such that the difference between the sum of the two subsets is equal to the given difference. 

# QUICK POINTS:

1. Let's take sum1 be the subset of one subset, sum be the total sum of the array and diff be the given difference.

It is obvious that

                    sum1-sum2=diff

                => sum1-(sum-sum1)=diff

                => 2*sum1= diff+ sum

                => sum1= (diff+sum)/2;

So, simply we can get the answer by finding the number of subsets with given sum= sum1, which is same as subset sum problem.
