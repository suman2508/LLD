package com.suman.lld.tictacktoe.piece;

public class PieceO extends PlayingPiece {
    public PieceO() {
        this.type = PieceType.O;
        this.symbol = 'O';
    }

    @Override 
    public PieceType getType() {
        return this.type;
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }

}
