package org.mom47.chess.model;


public class Queen extends ChessPiece {
    private static final String WHITE_QUEEN = "♕";
    private static final String BLACK_QUEEN = "♛";

    public Queen(PieceColour color, int file) {
        super(color);
        if (color==PieceColour.WHITE) {
            setSymbol(WHITE_QUEEN);
            setPosition(new Point(file, 1));
        } else {
            setSymbol(BLACK_QUEEN);
            setPosition(new Point(file, 8));
        }
    }

    @Override
    public String toString() {
        return "Queen [" + this.getSymbol() + ", " + this.getPosition() + ", (" + this.getPosition().getFile() + ", " + this.getPosition().getRank() + ")]";
    }
}
