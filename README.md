# Leetcode - Merged Sorted Array

## Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
## Memory Usage: 42.5 MB, less than 56.93% of Java online submissions for Merge Sorted Array.

In the first loop we have to put the min number into the result from the sorted array. We're breaking the first loop when one of the sorted array reach to its end. 
Afterwards this either second or third loop will add the remaining number to the result array from the sorted array which did not reach to the end. 
Then these values of the result array are stored in the nums1 array by the for loop.
