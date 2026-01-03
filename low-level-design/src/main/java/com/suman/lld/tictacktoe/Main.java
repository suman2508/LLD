package com.suman.lld.tictacktoe;

import java.util.List;
import java.util.Scanner;

import com.suman.lld.tictacktoe.board.Board;
import com.suman.lld.tictacktoe.game.Game;
import com.suman.lld.tictacktoe.game.GameStatus;
import com.suman.lld.tictacktoe.piece.PieceO;
import com.suman.lld.tictacktoe.piece.PieceX;
import com.suman.lld.tictacktoe.piece.PlayingPiece;
import com.suman.lld.tictacktoe.player.Player;

public class Main {

    public static void main (String[] args) {
        System.out.println("Hello Tic Tac Toe!");

        // 1. Create playing pieces
        PlayingPiece pieceX = new PieceX();
        PlayingPiece pieceO = new PieceO();

        // 2. Create Players
        Player player1 = new Player("Player-1", pieceX);
        Player player2 = new Player("Plyer-2", pieceO);

        List<Player> players = List.of(player1, player2);

        // 3. create Board
        Board board = new Board(3);

        // 4. create Game
        Game game = new Game(board, players);
        game.start();

        // 5. Input loop
        Scanner scanner = new Scanner(System.in);
        while (game.getStatus()== GameStatus.IN_PROGRESS){
            Player currentPlayer = game.getCurrentPlayer();
            System.out.println("\nCurrent Player: " + currentPlayer.getName());
            printBoard(board);
            System.out.print("Enter row (0, 1, or 2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0, 1, or 2): ");
            int col = scanner.nextInt();

            try{
                game.makeMove(row,col);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        // 6. Final Board 
        printBoard(board);

        if(game.getStatus() ==GameStatus.WIN){
            System.out.println("Game Over: We have a Winner!" + game.getWinner().getName());
        } else {
            System.out.println("Game Over: It's a Draw!");
        }

        scanner.close();
    }

     private static void printBoard(Board board) {
        int size = board.getSize();
        System.out.println("\nBoard:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                PlayingPiece piece = board.getPiece(i, j);
                System.out.print(
                    piece == null ? " . " : " " + piece.getSymbol() + " "
                );
            }
            System.out.println();
        }
    }

}
