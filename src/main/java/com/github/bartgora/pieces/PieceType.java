package com.github.bartgora.pieces;

public enum PieceType {
    PAWN('P'),
    ROOK('R'),
    KNIGHT('N'),
    QUEEN('Q'),
    BISHOP('B'),
    KING('K');

    private final char value;

    PieceType(char piece) {
        this.value = piece;
    }

    public char getValue() {
        return value;
    }
}
