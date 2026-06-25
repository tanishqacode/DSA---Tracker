# VALIDATE BST 

## Problem Link

https://leetcode.com/problems/validate-binary-search-tree/submissions/2045589172/

---

## Difficulty

 Medium 

---

## Topic

BST

---

## Pattern
- Recursion
- Boundary ranges
- PreOrder Traversal
---

## My Initial Thought Process

Firstly i thought i would choose traversal BFS traversal , but for that i had to make queue and then i thought i dont have to give the traversed tree , instead the tree is 
given and i want to go down for checking each node .

I thought i would just check if(node.left < node) and if(node.right > node) , it would just check the left and right node of the current root , not with the previous
BUT - i didnt read the ques properly , that the whole subtree should be a valid BST 

---

## Optimal Approach

### Idea

USE RANGES AND MAKE BOUNDARIES 
Make boundaries from (-infinity , +infinity) , make ranges for left and right node 
use recursion for doing down the  for left - (node.left , min, node.val) for right - (node.right , node.val,max)

### Why It Works
it makes a range , and checks where the node is in that range , by it is compared by all the previous roots 

### Time Complexity

O(n)

### Space Complexity

O(h)

---

## Mistakes I Made

- thought BFS
- didnt think about making a range
- didnt call the function in return 

---

## What I Learned

for maximum and minimum , use - Long.MAX_VALUE Long.MIN_VALUE

---

## Alternative Approaches

### Approach 1

Recursion + range + PreOrder

### Approach 2

Inorder 


- Two Sum II
- 3 Sum
- 4 Sum
