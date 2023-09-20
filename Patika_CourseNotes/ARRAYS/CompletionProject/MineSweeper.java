package CompletionProject;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    private char[][] board;
    private char[][] mineBoard;
    private int rows;
    private int cols;
    private int numMines;
    private boolean gameOver;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new char[rows][cols];
        this.mineBoard = new char[rows][cols];

    }

    void addMine() {
        initializeBoard(this.mineBoard);
        this.numMines = (this.rows * this.cols) / 4;
        while (this.numMines > 0) {
            int nrow = (int) (Math.random() * this.rows);
            int ncol = (int) (Math.random() * this.cols);
            if (this.mineBoard[nrow][ncol] != '*') {
                this.mineBoard[nrow][ncol] = '*';
                this.numMines--;
            }

        }

    }

    void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '-');
        }

    }

    void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printmineBoard() {
        for (int i = 0; i < mineBoard.length; i++) {
            for (int j = 0; j < mineBoard[i].length; j++) {
                System.out.print(this.mineBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[] choosePoint() {
        int[] selected = new int[2];
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter row: ");
            int row = scan.nextInt();
            System.out.print("Enter col: ");
            int col = scan.nextInt();

            if (row > 0 && row <= this.rows && col > 0 && col <= this.cols) {

                if (Character.isDigit(this.board[row - 1][col - 1])) {
                    System.out.println("Already selected point");
                } else {

                    selected[0] = row;
                    selected[1] = col;
                    break;
                }
            } else {
                System.out.println("Enter valid row and column numbers.");
            }
        }

        return selected;
    }

    boolean isSuitable(int row, int col) {
        if (this.mineBoard[row - 1][col - 1] == '*') {
            this.gameOver = true;
            return true;
        }
        return false;
    }

    int printMineCount(int row, int col) {
        int mineCount = 0;
        row--;
        col--;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols && this.mineBoard[i][j] == '*') {
                    mineCount++;
                }
            }
        }
        return mineCount;

    }

    void run() {
        System.out.println("Your current board:");
        initializeBoard(this.board);
        System.out.println("================");
        addMine();
        printBoard();
        System.out.println("Mines are added.");
        System.out.println("================");

        while (true) {
            if (isCheckEmpty()) {
                System.out.print("\nCongratulations! You won!\n");
                printmineBoard();
                System.out.println("================");
                break;
            }

            if (!this.gameOver) {
                int[] points = choosePoint();
                int row = points[0];
                int col = points[1];

                if (isSuitable(row, col)) {
                    System.out.print("\nGame Over! You lost!\n");
                    printmineBoard();
                    break;
                } else {
                    this.board[row - 1][col - 1] = (char) (printMineCount(row, col) + '0');
                    System.out.println("Your current board:");
                    printBoard();
                    System.out.println("================");
                }
            }
        }
    }

    boolean isCheckEmpty() {
        int tireCount = 0;
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if (this.board[i][j] == '-')
                    tireCount++;
            }
        }
        this.numMines = (this.rows * this.cols) / 4;

        return tireCount == this.numMines ? true : false;
    }

}
