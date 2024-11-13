# Project Euler 18 - Maximum Path Sum I

Written in Kotlin.

Solution the the PE problem n. 18 - Maximum Path Sum I.
The problem involves finding the highest path in a triangle of arrays of integers.
The solution is found by creating a tree structure in which at each step the highest previous values is collected and updated as parent of the current one. Finally, simply by checking the chain of parents from the highest value node one can
obtain the highest path value.
