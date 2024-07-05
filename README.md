#BUBBLE SORTING

Bubble sort is the simplest sorting algorithm. It works by iterating the input array from the first
element to the last, comparing each pair of elements and swapping them if needed. Bubble sort
continues its iterations until no more swaps are needed. The algorithm gets its name from the way
smaller elements “bubble” to the top of the list. Generally, insertion sort has better performance
than bubble sort. Some researchers suggest that we should not teach bubble sort because of its
simplicity and high time complexity.
The only significant advantage that bubble sort has over other implementations is that it can detect
whether the input list is already sorted or not.

Algorithm takes O(n2) (even in best case). We can improve it by using one extra flag. No more
swaps indicate the completion of sorting. If the list is already sorted, we can use this flag to skip
the remaining passes.

Performance
Worst case complexity : O(n2)
Best case complexity (Improved version) : O(n)
Average case complexity (Basic version) : O(n2)
Worst case space complexity : O(1) auxiliary


![mceu_61632030011682402256084](https://github.com/ys5sh/All-Sorting-Algorithm/assets/88985349/461a4532-ec8b-40d5-99fd-89456437a57c)


#SELECTIVE SORTING

Selection sort is an in-place sorting algorithm. Selection sort works well for small files. It is used
for sorting the files with very large values and small keys. This is because selection is made
based on keys and swaps are made only when required.

Advantages
• Easy to implement
• In-place sort (requires no additional storage space)
Disadvantages
• Doesn’t scale well: O(n

Algorithm
1. Find the minimum value in the list
2. Swap it with the value in the current position
3. Repeat this process for all the elements until the entire array is sorted
This algorithm is called selection sort since it repeatedly selects the smallest element

![Selection-sort](https://github.com/ys5sh/All-Sorting-Algorithm/assets/88985349/b7b0e633-ba16-49ae-9699-1d71b7161498)



