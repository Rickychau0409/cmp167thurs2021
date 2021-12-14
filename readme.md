#  Given an array of integers {4, 1, 2, 3, 5}
# 	How can you sort this array?
#  Bubble sort 
#  Time complexity : 0(n^2) worst case 
int temp = arr [j];
arr[j]   = arr[j] + arr[j+1];
arr[j+1] = arr[j] - arr[j+1];
arr[j]   = arr[j] - arr[j+1];

##
a = 5;
b = 7;
a = a + b; 5+7 => 12
b = a - b; 12 -7 =>5
a = a - b; 12 - 5 =>7

##
a = 7; 111
b = 5; 101
a = a ^ b; 111 ^ 101 => 010 => 2
b = a ^ b; 010 ^ 101 => 111 => 7
a = a ^ b; 010 ^ 111 => 101 => 5