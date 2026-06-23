# Largest Element 

## Problem Link

https://takeuforward.org/plus/dsa/problems/largest-element?source=strivers-a2z-dsa-track

---

## Difficulty

Easy 

---

## Topic

Arrays

---

## Pattern

Sorting 
loops 

---

## My Initial Thought Process
First i thought of sorting of the whole in ascending order and then print the last element that gives the largest element 

---

## Brute Force Approach

### Idea

Sort the whole array in ascending order
print the last element of array 

### Time Complexity

O(N log N), where N is the size of the array, as we are sorting the array.


### Space Complexity

 O(1), as we are using a constant

---

## Optimal Approach

### Idea

store the 1st element in a variable max 
iterate through the whole array 
compare the max with the next element 
if next element is greater that max , put its value in max 
After iterating the whole loop print max , which holds the largest element of array 

### Why It Works

Instead of sorting of all the elements 1st that will take a time complexity of O(nlogn) , why dont we just fix at 1 position and iterate having a time complexity of O(n)
### Time Complexity

O(n)

### Space Complexity

O(1)

---

## Mistakes I Made

- 
- Used value instead of index.
- Wrong HashMap key.
- Off-by-one error.

---

## What I Learned

Example:

This is a classic HashMap complement pattern.

---

## Alternative Approaches

### Approach 1

Sorting + Two Pointers

### Approach 2

HashMap

---

## Revision Status

- [ ] Revised after 1 day
- [ ] Revised after 7 days
- [ ] Revised after 30 days
- [ ] Can solve without help

---

## Similar Questions

- Two Sum
- Two Sum II
- 3 Sum
- 4 Sum
