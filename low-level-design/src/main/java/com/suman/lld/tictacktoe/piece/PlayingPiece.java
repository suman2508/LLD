package com.suman.lld.tictacktoe.piece;

public abstract class PlayingPiece {
    PieceType type;
    char symbol;

    abstract PieceType getType();
    public abstract char getSymbol();
}
