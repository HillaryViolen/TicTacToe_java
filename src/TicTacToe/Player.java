package TicTacToe;

import java.util.Scanner;

public class Player {
    private char symbol;
    private Board board;

    public Player(char symbol, Board board) {
        this.symbol = symbol;
        this.board = board;
    }

    public void playerMove() {
        Scanner input = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.println("Player " + symbol + ", enter your move (row and column): ");
            row = input.nextInt();
            col = input.nextInt();
            if (board.placeMove(row, col, symbol)) break;
            System.out.println("This move is not valid, try again.");
        }
    }

    public char getSymbol() {
        return symbol;
    }
}
