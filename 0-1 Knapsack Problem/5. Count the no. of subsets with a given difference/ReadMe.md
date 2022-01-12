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


## STEPS:

1. We are taking user input n, diff, a[n] as size of array, given difference and the array respectively.

2. Now, we can find sum1=(total sum + diff)/2

2. Now, we are taking a  matrix of size (n+1)*(sum1+1) to store the count for each cases smaller than the given case, to recursively get the value of the given case.

3. Now, we are using two loops for the matrix, i is for size of array and j is for current sum. You can initialize that if sum is zero i.e. j=0, count will be 1 and if size is zero and sum is not equal to zero, i.e. i=0 and j!=0, the count will be zero.

4. In the next cases, there are two possible subcases, either we will include the element or not. If the value of the element is greater than the current sum, we will not include the current element and simply return the count without including it.


    If the element is less than or equal to current sum, then there are again two sub sub cases, either we will include it or we can exclude it and return the count as the sum of the count of the two possible cases. 
