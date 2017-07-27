package org.mom47.chess.model;


public class King extends ChessPiece {
    private static final String WHITE_KING = "♔";
    private static final String BLACK_KING = "♚";

    public King(PieceColour color, int file) {
        super(color);
        if (color == PieceColour.WHITE) {
            setSymbol(WHITE_KING);
            setPosition(new Point(file, 8));
        } else {
            setSymbol(BLACK_KING);;
            setPosition(new Point(file, 1));
        }
    }

    @Override
    public String toString() {
        if(getIsCaptured() == true) {
            state = " - captured";
        } else if(getPosition().getFile() == 1) {
            state = " - A" + getPosition().getRank();
        } else if(getPosition().getFile() == 2) {
            state = " - B" + getPosition().getRank();
        } else if(getPosition().getFile() == 3) {
            state = " - C" + getPosition().getRank();
        } else if(getPosition().getFile() == 4) {
            state = " - D" + getPosition().getRank();
        } else if(getPosition().getFile() == 5) {
            state = " - E" + getPosition().getRank();
        } else if(getPosition().getFile() == 6) {
            state = " - F" + getPosition().getRank();
        } else if(getPosition().getFile() == 7) {
            state = " - G" + getPosition().getRank();
        } else if(getPosition().getFile() == 8) {
            state = " - H" + getPosition().getRank();
        }
        return this.getSymbol() + state;
    }
}
