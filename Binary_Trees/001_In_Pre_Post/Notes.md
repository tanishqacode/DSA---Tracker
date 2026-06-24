# Pre, Post, Inorder in one traversal

## Problem Link

https://takeuforward.org/plus/dsa/problems/pre,-post,-inorder-in-one-traversal?source=strivers-a2z-dsa-track

---

## Difficulty

Easy

---

## Topic

BINARY TREES

---

## Pattern
ArrayList concept is used 

---

## My Initial Thought Process
Firstly i thought of making differet functions for each other , solve them recursively and then call them in the main function , this worked 

BUT - the ques asked to solve each traversal in 1 iterations , in my uproach im using 3 iterations  1 for each traversal 

---

## Brute Force Approach

### Idea

make diff functions for each traversal 
- store them in a list
- add that list to the main list
- return the main list

### Time Complexity

O(n)

### Space Complexity

O(H)

---

## Optimal Approach

### Idea
This approach traverses the binary tree in a single pass while computing the preorder, inorder and postorder traversals at the same time. A stack is used for state management. The stack keeps track of the traversal state for each node. It stores nodes and their state information allowing the algorithm to resume traversal from intermediate points. For each node, it identifies its state i.e. if it's in the preorder state, it records the node's value and pushes the left child onto the stack. Moving to the inorder state, it records the node's value and pushes the right child onto the stack. Finally, in the post-order state, it stores the node's value and pops the node. As the algorithm executes over each node, it pushes each value in separate arrays for preorder, inorder and postorder traversals depending upon the current order and sequence. Hence, we are able to traverse the tree just once and get all three traversals from it.
- Start at the root of the binary tree.Initialise a stack that holds a tree node and an integer value representing its state corresponding to pre order, inorder and    postorder. Initialise empty arrays to store the three traversals as well.Check if the tree is empty. If so, return empty traversals.
 - Push the root node onto the stack along with its state ‘1’ (preorder) to start the traversal.
 - While the stack isn’t empty, pop the top node of the stack and for each node:
         -If the state is ‘1’ ie. preorder: store the node’s data in the preorder array and move its state to 2 (inorder) for this node. Push this updated state back               onto the stack and push its left child as well.
          -If the state is ‘2’ ie. inorder: store the node’s data is the inorder array and update its state to 3 (postorder) for this node. Push the updated state back              onto the stack and push the right child onto the stack as well.
           -If the state is ‘3’ ie. postorder: store the node’s data in the postorder array and pop it.
   -Return the preorder, inorder and postorder array.


### Time Complexity

O(n)

### Space Complexity

O(n)

---

## Mistakes I Made

- Forgot base case.
- Used value instead of index.
- Wrong HashMap key.
- Off-by-one error.

---

## What I Learned

1) Revised Recursion
2) Stack - its implementation
         - methods 
---

## Alternative Approaches

### Approach 1

Stacks 

### Approach 2

Recursion
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
