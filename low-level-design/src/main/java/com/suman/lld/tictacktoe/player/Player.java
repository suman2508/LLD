package com.suman.lld.tictacktoe.player;

import com.suman.lld.tictacktoe.piece.PlayingPiece;

public class Player {

    private final String name;
    private final PlayingPiece piece;

    public Player(String name , PlayingPiece piece){
        this.name = name;
        this.piece = piece;
    }

    public String getName(){
        return this.name;
    }

    public PlayingPiece getPiece(){
        return this.piece;
    }
}
