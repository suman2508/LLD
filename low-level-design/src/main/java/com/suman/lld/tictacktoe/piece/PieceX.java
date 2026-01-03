package com.suman.lld.tictacktoe.piece;

public class PieceX extends PlayingPiece {
    public PieceX() {
        this.type = PieceType.X;
        this.symbol = 'X';
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
