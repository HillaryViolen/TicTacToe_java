package TicTacToe;

public class Main {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;

    public static void main(String[] args) {
        Main game = new Main();
        game.initializeGame();
        game.playGame();
    }

    public void initializeGame() {
        board = new Board();
        playerX = new Player('X', board);
        playerO = new Player('O', board);
        currentPlayer = playerX;
    }

    public void playGame() {
        board.printBoard();
        while (true) {
            currentPlayer.playerMove();
            board.printBoard();
            
            if (board.checkWin(currentPlayer.getSymbol())) {
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                break;
            }
            if (board.isBoardFull()) {
                System.out.println("The game is a tie!");
                break;
            }
            switchPlayer();
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }
}
