package com.github.bartgora.pieces;

public abstract sealed class ChessPiece permits Pawn, Rook, Knight, King, Queen, Bishop {

    protected final PieceType type;
    protected final String rank;
    protected final Integer file;

    protected ChessPiece(PieceType type, String rank, Integer file) {
        this.type = type;
        this.rank = rank;
        this.file = file;
    }
}
