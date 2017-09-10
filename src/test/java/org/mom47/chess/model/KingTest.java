package org.mom47.chess.model;


import org.junit.Assert;
import org.junit.Test;

public class KingTest {

    @Test
    public void testGetAvailablePaths() throws Exception {
        ChessBoard chessBoard = new ChessBoard();
        King king = new King(PieceColour.BLACK, 4);
        chessBoard.setPiece(king);

        chessBoard.move(king.getPosition(), new Point(4, 4));
        Point position = king.getPosition();
        Assert.assertEquals(new Point(4, 4), position);

        Point[][] availablePaths = king.getAvailablePaths();
        Assert.assertEquals(8, availablePaths.length);

        // check that every paths is 1 squire long
        Assert.assertEquals(1, availablePaths[0].length);
        Assert.assertEquals(1, availablePaths[1].length);
        Assert.assertEquals(1, availablePaths[2].length);
        Assert.assertEquals(1, availablePaths[3].length);
        Assert.assertEquals(1, availablePaths[4].length);
        Assert.assertEquals(1, availablePaths[5].length);
        Assert.assertEquals(1, availablePaths[6].length);
        Assert.assertEquals(1, availablePaths[7].length);

        // check the path UP
        availablePaths[0][0] = new Point(4, 5);
        Assert.assertEquals(new Point(4, 5), availablePaths[0][0]);

        // check the path UP-RIGHT
        availablePaths[1][0] = new Point(5, 5);
        Assert.assertEquals(new Point(5, 5), availablePaths[1][0]);

        // check the path RIGHT
        availablePaths[2][0] = new Point(5, 4);
        Assert.assertEquals(new Point(5, 4), availablePaths[2][0]);

        // check the path DOWN-RIGHT
        availablePaths[3][0] = new Point(5, 3);
        Assert.assertEquals(new Point(5, 3), availablePaths[3][0]);

        // check the path DOWN
        availablePaths[4][0] = new Point(4, 3);
        Assert.assertEquals(new Point(4, 3), availablePaths[4][0]);

        // check the path DOWN-LEFT
        availablePaths[5][0] = new Point(3, 3);
        Assert.assertEquals(new Point(3, 3), availablePaths[5][0]);

        // check the path LEFT
        availablePaths[6][0] = new Point(3, 4);
        Assert.assertEquals(new Point(3, 4), availablePaths[6][0]);

        // check the path UP-LEFT
        availablePaths[7][0] = new Point(3, 5);
        Assert.assertEquals(new Point(3, 5), availablePaths[7][0]);

    }
}