package org.mom47.chess.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChessBoardTest {
    @Test
    public void testGetFreeSquiresNumber() throws Exception {
        ChessBoard chessBoard = new ChessBoard();

        Assert.assertEquals(64, chessBoard.getFreeSquiresNumber());

        King king = new King(PieceColour.BLACK, 0);
        chessBoard.setPiece(king);
        Assert.assertEquals(63, chessBoard.getFreeSquiresNumber());

        Queen queen = new Queen(PieceColour.WHITE, 7);
        chessBoard.setPiece(queen);
        Assert.assertEquals(62, chessBoard.getFreeSquiresNumber());
    }

    @Test
    public void testGetFreeSquiresEmptyBoard() {
        ChessBoard chessBoard = new ChessBoard();

        // first test case
        // conditions:
        // empty chess board

        // execution
        Point[] squires = chessBoard.getFreeSquires();

        // expectations:
        // not null array of 64 length
        Assert.assertNotNull(squires);
        Assert.assertEquals(64, squires.length);
        // each of array element must have an instance of Point object which represents an empty squire on the board
        // we need to make sure that all squires of the board exist in the result of execution getFreeSquires method
        // we will create two loops to run though all squires of the chess board and we will try to find all of them
        // in the resulting array returned by getFreeSquires

        // running through files (horizontally)
        for (int file = 0; file < 8; file++) {
            // running through ranks (vertically)
            for (int rank = 0; rank < 8; rank++) {
                // making sure that we can find all squires
                Assert.assertNotNull(findPointByFileAndRank(squires, file, rank));
            }
        }
    }

    @Test
    public void testGetFreeSquiresWithAllChessPiecesOnTheBoard() {
        ChessBoard chessBoard = new ChessBoard();

        // second test case
        // conditions:
        // chess board is full with chess pieces
        // running through files (horizontally)
        for (int file = 0; file < 8; file++) {
            // running through ranks (vertically)
            for (int rank = 0; rank < 8; rank++) {
                // adding a new chess piece on the board
                ChessPiece chessPiece = new ChessPiece(PieceColour.WHITE);
                chessPiece.setPosition(new Point(file, rank));
                chessBoard.setPiece(chessPiece);
            }
        }

        // execution
        Point[] squires = chessBoard.getFreeSquires();

        // expectations:
        // not null array of zero length
        Assert.assertNotNull(squires);
        Assert.assertEquals(0, squires.length);
    }

    @Test
    public void testGetFreeSquiresWithSinglePieceOnTheBoard() {
        ChessBoard chessBoard = new ChessBoard();

        // third test case
        // conditions:
        // chess board has only one chess piece by (4,4) (file, rank)

        int file = 4;
        int rank = 4;
        ChessPiece chessPiece = new ChessPiece(PieceColour.WHITE);
        chessPiece.setPosition(new Point(file, rank));
        chessBoard.setPiece(chessPiece);

        // execution
        Point[] squires = chessBoard.getFreeSquires();

        // expectations:
        // not null array, length is 63
        Assert.assertNotNull(squires);
        Assert.assertEquals(63, squires.length);
        // array contains 63 Points, there should NOT be the pouint by 4,4 coordinate
        for (int i = 0; i < squires.length; i++) {
            assertFalse(squires[i].getFile() == 4 && squires[i].getRank() == 4);
        }
    }

    /**
     * This method tries to find a point by its coordinates. If no any point found, then null is returned.
     * @param points an array of points
     * @param file file to find
     * @param rank rank to find
     * @return a point with matching file and rank
     */
    private Point findPointByFileAndRank(Point[] points, int file, int rank) {
        for (int i = 0; i < points.length; i++) {
            Point point = points[i];
            if (point.getFile() == file && point.getRank() == rank) {
                return point;
            }
        }
        return null;
    }

    @Test
    public void testGetSetPiece() {
        ChessBoard chessBoard = new ChessBoard();

        int figureOnefile = 6;
        int figureOnerank = 6;
        ChessPiece chessPiece = new ChessPiece(PieceColour.BLACK);
        chessPiece.setPosition(new Point(figureOnefile, figureOnerank));
        chessBoard.setPiece(chessPiece);

        int figureTwofile = 5;
        int figureTwoRank = 5;
        ChessPiece piece = new ChessPiece(PieceColour.WHITE);
        piece.setPosition(new Point(figureTwofile, figureTwoRank));
        chessBoard.setPiece(piece);

        Assert.assertEquals(chessBoard.getPiece(new Point(5, 5)), piece);
        Assert.assertEquals(chessBoard.getPiece(new Point(6, 6)), chessPiece);
    }
}
