package com.suman.lld.tictacktoe.board;

import com.suman.lld.tictacktoe.piece.PlayingPiece;

public class Board {
    private final int size;
    private final PlayingPiece[][] grid;

    public Board(int size) {
        this.size = size;
        this.grid = new PlayingPiece[size][size];
    }

    public int getSize(){
        return size;
    }

    public boolean placePiece(int row, int col, PlayingPiece piece){
        if(!isValidPosition(row,col) || !isCellEmpty(row,col)){
            return false;
        }

        grid[row][col] =  piece;
        return true;
    } 

    public boolean isCellEmpty(int row, int col){
        return grid[row][col] == null;
    }

    public boolean isFull(){
        for(int i = 0; i < size; i++){
            for(int j =0  ; j < size; j++){
                if(grid[i][j] ==null){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidPosition(int row, int col){
        return row >= 0 && row < size && col >= 0 && col < size;
    }

    public PlayingPiece getPiece(int row, int col){
        if(!isValidPosition(row,col))  {
            throw new IllegalArgumentException("Invalid board position");
        }
        return grid[row][col];
    }


}
