package com.suman.lld.tictacktoe.game;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import com.suman.lld.tictacktoe.board.Board;
import com.suman.lld.tictacktoe.piece.PlayingPiece;
import com.suman.lld.tictacktoe.player.Player;

public class Game {

    private final Board board;
    private final Deque<Player> players;
    private GameStatus status;
    private Player winner;


    public Game(Board board, List<Player> players){
        this.board= board;
        this.players = new ArrayDeque<>(players);
        this.status = GameStatus.IN_PROGRESS;
    }

    public void start(){
        this.status = GameStatus.IN_PROGRESS;
    }

    public GameStatus getStatus(){
        return status;
    }

    public Player getWinner(){
        return winner;
    }

    public Player getCurrentPlayer(){
        return players.peekFirst();
    }

    public void makeMove(int row, int col) {

        if(status != GameStatus.IN_PROGRESS){
            throw new IllegalStateException("Game has ended");
        }

        Player currentPlayer = players.pollFirst();

        boolean placed = board.placePiece(row,col,currentPlayer.getPiece());
        if(!placed){
            players.offerFirst(currentPlayer);
            throw new IllegalArgumentException("Invalid move");
        }

        if(checkWinner(row, col, currentPlayer.getPiece())){
            status = GameStatus.WIN;
            winner = currentPlayer;
            System.out.println("Winner is: " +currentPlayer.getName());
            return;
        }

        if(board.isFull()){
            status = GameStatus.DRAW;
            System.out.println("Game is a draw");
            return;
        }

        players.offerLast(currentPlayer); //rotate turn to next player

    }
    
    private boolean checkWinner(int row , int col, PlayingPiece piece){
        int size = board.getSize();

        boolean rowWin = true;
        boolean colWin = true;
        boolean diagWin = true;
        boolean antiDiagWin = true;

        for (int i = 0; i<size; i++){
            if(board.getPiece(row,i) != piece) rowWin = false;
            if(board.getPiece(i,col) != piece) colWin = false;
            if(board.getPiece(i,i) != piece) diagWin = false;
            if(board.getPiece(i, size - 1 - i) != piece) antiDiagWin = false;
        }

        return rowWin || colWin || diagWin || antiDiagWin;
    }
}
