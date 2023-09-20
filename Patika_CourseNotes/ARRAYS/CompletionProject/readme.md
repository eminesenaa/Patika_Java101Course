# Game Rules :

- The game is text based.

- It should be played on double-dimensional arrays and designed within the MineSweeper class.

- The user must determine the matrix size, that is, the number of rows and columns.

- Random mines should be placed as a quarter of the number of elements in the array (number of elements / 4). For example, if the array is 4x3 in size, the number of elements should be calculated with the formula (Number of rows * Number of columns) and its size should be 12. In this case, the number of mines should be 12 / 4 = 3 pieces. (hint: you can create a second array to hold the positions of these mines.)

- The user must select a point on the matrix. Must enter row and column values for point selection.

- It should be checked whether the selected point is within the boundaries of the array and if the condition is not met, the point should be requested again.

- If there is a mine at the point where the user enters, he must lose the game.

- If there are no mines, all positions touching the relevant point should be examined (right, left, above, below, upper left diagonally, upper right diagonally, lower right diagonally, lower left diagonally) and the sum of the number of mines around it should be written at the relevant point. If there is no mine touching the point, the value "0" should be assigned.

- If the user can select all the dots without stepping on any mines, they should win the game.

**In addition to these conditions;**
- Entering the index in a way that the user can understand (i.e. (1,2) instead of (0,1))
```
================
Enter row: 1
Enter col: 2
Your current board:
- 2 - 
- - - 
- - - 
================
```
- Inability to select the same point again
```
================
Enter row: 1
Enter col: 2
Your current board:
- 1 -
- - -
- - -
================
Enter row: 1
Enter col: 2
Already selected point
Enter row:_
```

- Receiving input when an entry exceeding the indexes is made
``` 
================
Enter row: 12
Enter col: 2
Enter valid row and column numbers.
Enter row:_
```
conditions have been added.





# Losing Scenario
```
Your current board:
================
- - - 
- - - 
- - - 
Mines are added.
================
Enter row: 3
Enter col: 3
Your current board:
- - - 
- - - 
- - 1 
================
Enter row: 1
Enter col: 1

Game Over! You lost!
* - - 
- - * 
- - - 
```
# Winning Scenario

```
Your current board:
================
- - - 
- - - 
- - - 
Mines are added.
================
Enter row: 1
Enter col: 1
Your current board:
1 - - 
- - - 
- - - 
================
Enter row: 3
Enter col: 3
Your current board:
1 - - 
- - - 
- - 2 
================
Enter row: 1
Enter col: 2
Your current board:
1 2 - 
- - - 
- - 2 
================
Enter row: 3
Enter col: 1
Your current board:
1 2 - 
- - - 
1 - 2 
================
Enter row: 3
Enter col: 2
Your current board:
1 2 - 
- - - 
1 2 2 
================
Enter row: 1
Enter col: 3
Your current board:
1 2 2
- - -
1 2 2
================
Enter row: 2
Enter col: 1
Your current board:
1 2 2
1 - -
1 2 2
================

Congratulations! You won!
- - -
- * *
- - -
================ 
```
