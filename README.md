# Tic Tac Toe 
This is a simple implementation of the common paper and pencil game: Tic Tac Toe in Java.

# Features
Simply download the file, and run the program to begin the game. 

The game board consists of a 3 x 3 grid in which the player and the cpu take turns placing pieces on the game board. 
The player game piece is 'X' and the cpu's game piece is 'O.'
The player must have a number from 1 - 9 to place a game piece on the board. 
After your turn, the cpu will place a random piece on the board also between 1 - 9. 
The game is coded to prevent both the player or cpu from placing pieces on top of placements that already have a piece.
The game continues until one of three results have been reached.

Three potential results from the game: "Congratulations, you won!" "CPU wins! Sorry : (" or "tie!"

# Process
My goal was to build a simple project to showcase my learning, settling on the classic Tic Tac Toe. 
I began by creating the game board in a 2D array, creating a function to print out the board, and created anoted function to place pieces on the board, setting the players deafult piece to 'X' and the cpu's default piece to 'O.'
The next step was to create a simple game loop that would allow the player to place a piece, and the cpu to a place a piece. However, I quickly realized that both the player and cpu could place pieces on top of already place spots on the board. 
To remedy this, I created static ArrayLists that would hold the playerPositions on the board and another to hold the cpuPositions on the board, using a second while loop within the original game loop to prevent both cpu and player pieces from being placed on top of each other. 
Then, I created a function to check the winner of the game. I created lists of all of the potential winning conditions, adding them to an ArrayList, utilizing a for loop to print out the results of the game. 
I added this function to the game loop, checking for a winner after every piece was placed on a board.


# Learning
- Logic development for checking winning conditions, and preventing invalid moves
- Utilizing data structures to organize and effectively manage data
- Breaking down code into functions for specific tasks, streamlining the main method
- Utilizing conditional statements and loops to validate user input, and control the flow of the game
- Implementing random number generation to make the computer's moves unpredictable
- Debugging unexpected behavior in code 

# Improvement
In the future, the cpu's game pieces can be optimized to skew towards a winning combination rather than being purely random. 
Another iteration of the game can be made with two players, allowing for more player interaction.


# Running the Project

Download the File
[Tic Tac Toe Board](https://github.com/znzhenn/Tic-Tac-Toe-Board/blob/main/TicTacToe.java)

Game Preview
```Java
This is the game board: 
 | | 
-+-+-
 | | 
-+-+-
 | | 

Enter your placement (1-9): 
9
Cpu's turn: 6
 | | 
-+-+-
 | |O
-+-+-
 | |X

Enter your placement (1-9): 
1
Cpu's turn: 5
X| | 
-+-+-
 |O|O
-+-+-
 | |X

Enter your placement (1-9): 
4
Cpu's turn: 3
X| |O
-+-+-
X|O|O
-+-+-
 | |X

Enter your placement (1-9): 
2
Cpu's turn: 7
X|X|O
-+-+-
X|O|O
-+-+-
O| |X

CPU wins! Sorry : (
X|X|O
-+-+-
X|O|O
-+-+-
O| |X

```
