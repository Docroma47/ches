package org.mom47.chess.controller;

import org.mom47.chess.model.*;
import org.mom47.chess.view.ChessBashView;

import java.util.Random;

public class FunController {
    private Chess chess;
    private ChessBashView chessBashView;

    public FunController(Chess chess, ChessBashView chessBashView) {
        this.chess = chess;
        this.chessBashView = chessBashView;
    }

    private int getInitialDirection(ChessPiece chessPiece) {
        Random random = new Random();
        int direction;
        if (chessPiece.getPieceType().equals(PieceType.PAWN) && chessPiece.getColor().equals(PieceColour.WHITE)) {
            direction = 0;
        } else if (chessPiece.getPieceType().equals(PieceType.PAWN) && chessPiece.getColor().equals(PieceColour.BLACK)) {
            direction = 1;
        } else if (chessPiece.getPieceType().equals(PieceType.QUEEN)) {
            direction = random.nextInt(8);
        } else if (chessPiece.getPieceType().equals(PieceType.BISHOP)) {
            direction = 3 + random.nextInt(4) + 1;
        } else if (chessPiece.getPieceType().equals(PieceType.KING)) {
            direction = random.nextInt(8);
        } else if (chessPiece.getPieceType().equals(PieceType.ROOK)) {
            direction = random.nextInt(4);
        } else {
            direction = 7 + random.nextInt(4) + 1;
        }
        return direction;
    }

    private void pawnLogic(ChessPiece chessPiece) {
        if (chessPiece.getPieceType().equals(PieceType.PAWN) && chessPiece.getPosition().getRank() == 7 && chessPiece.getColor().equals(PieceColour.WHITE)) {

        }
        if (chessPiece.getPieceType().equals(PieceType.PAWN) && chessPiece.getPosition().getRank() == 7 && chessPiece.getColor().equals(PieceColour.BLACK)) {

        }
    }

    private void queenLogic(ChessPiece chessPiece) {
        Random random = new Random();
        if (chessPiece.getPieceType().equals(PieceType.QUEEN) && chessPiece.getPosition().getRank() == 7 && (getInitialDirection(chessPiece) == 0 || getInitialDirection(chessPiece) == 4 || getInitialDirection(chessPiece) == 6)) {

        } else if (chessPiece.getPieceType().equals(PieceType.QUEEN) && chessPiece.getPosition().getRank() == 0 && (getInitialDirection(chessPiece) == 1 || getInitialDirection(chessPiece) == 5 || getInitialDirection(chessPiece) == 7)) {

        } else if (chessPiece.getPieceType().equals(PieceType.QUEEN) && chessPiece.getPosition().getFile() == 0 && (getInitialDirection(chessPiece) == 2 || getInitialDirection(chessPiece) == 5 || getInitialDirection(chessPiece) == 6)) {

        } else if (chessPiece.getPieceType().equals(PieceType.QUEEN) && chessPiece.getPosition().getFile() == 7 && (getInitialDirection(chessPiece) == 3 || getInitialDirection(chessPiece) == 4 || getInitialDirection(chessPiece) == 7)) {

        }
    }

    private void kingLogic(ChessPiece chessPiece) {
        Random random = new Random();
        if (chessPiece.getPieceType().equals(PieceType.KING) && chessPiece.getPosition().getRank() == 7 && (getInitialDirection(chessPiece) == 0 || getInitialDirection(chessPiece) == 4 || getInitialDirection(chessPiece) == 6)) {

        } else if (chessPiece.getPieceType().equals(PieceType.KING) && chessPiece.getPosition().getRank() == 0 && (getInitialDirection(chessPiece) == 1 || getInitialDirection(chessPiece) == 5 || getInitialDirection(chessPiece) == 7)) {

        } else if (chessPiece.getPieceType().equals(PieceType.KING) && chessPiece.getPosition().getFile() == 0 && (getInitialDirection(chessPiece) == 2 || getInitialDirection(chessPiece) == 5 || getInitialDirection(chessPiece) == 6)) {

        } else if (chessPiece.getPieceType().equals(PieceType.KING) && chessPiece.getPosition().getFile() == 7 && (getInitialDirection(chessPiece) == 3 || getInitialDirection(chessPiece) == 4 || getInitialDirection(chessPiece) == 7)) {

        }
    }

    private void bishopLogic(ChessPiece chessPiece) {
        Random random = new Random();
        if (chessPiece.getPieceType().equals(PieceType.BISHOP) && chessPiece.getPosition().getRank() == 7 && (getInitialDirection(chessPiece) == 0 || getInitialDirection(chessPiece) == 4 || getInitialDirection(chessPiece) == 6)) {

        } else if (chessPiece.getPieceType().equals(PieceType.BISHOP) && chessPiece.getPosition().getRank() == 0 && (getInitialDirection(chessPiece) == 1 || getInitialDirection(chessPiece) == 5 || getInitialDirection(chessPiece) == 7)) {

        } else if (chessPiece.getPieceType().equals(PieceType.BISHOP) && chessPiece.getPosition().getFile() == 0 && (getInitialDirection(chessPiece) == 2 || getInitialDirection(chessPiece) == 5 || getInitialDirection(chessPiece) == 6)) {

        } else if (chessPiece.getPieceType().equals(PieceType.BISHOP) && chessPiece.getPosition().getFile() == 7 && (getInitialDirection(chessPiece) == 3 || getInitialDirection(chessPiece) == 4 || getInitialDirection(chessPiece) == 7)) {

        }
    }

    private void rookLogic(ChessPiece chessPiece) {
        Random random = new Random();
        if (chessPiece.getPieceType().equals(PieceType.ROOK) && chessPiece.getPosition().getRank() == 7 && (getInitialDirection(chessPiece) == 0 || getInitialDirection(chessPiece) == 4 || getInitialDirection(chessPiece) == 6)) {

        } else if (chessPiece.getPieceType().equals(PieceType.ROOK) && chessPiece.getPosition().getRank() == 0 && (getInitialDirection(chessPiece) == 1 || getInitialDirection(chessPiece) == 5 || getInitialDirection(chessPiece) == 7)) {

        } else if (chessPiece.getPieceType().equals(PieceType.ROOK) && chessPiece.getPosition().getFile() == 0 && (getInitialDirection(chessPiece) == 2 || getInitialDirection(chessPiece) == 5 || getInitialDirection(chessPiece) == 6)) {

        } else if (chessPiece.getPieceType().equals(PieceType.ROOK) && chessPiece.getPosition().getFile() == 7 && (getInitialDirection(chessPiece) == 3 || getInitialDirection(chessPiece) == 4 || getInitialDirection(chessPiece) == 7)) {

        }
    }

    private void knightLogic(ChessPiece chessPiece) {
        Random random = new Random();
        if (chessPiece.getPieceType().equals(PieceType.KNIGHT) && chessPiece.getPosition().getRank() == 7 && (getInitialDirection(chessPiece) == 8 || getInitialDirection(chessPiece) == 9 || getInitialDirection(chessPiece) == 10 || getInitialDirection(chessPiece) == 11)) {

        } else if (chessPiece.getPieceType().equals(PieceType.KNIGHT) && chessPiece.getPosition().getRank() == 0 && (getInitialDirection(chessPiece) == 8 || getInitialDirection(chessPiece) == 9 || getInitialDirection(chessPiece) == 10 || getInitialDirection(chessPiece) == 11)) {

        } else if (chessPiece.getPieceType().equals(PieceType.KNIGHT) && chessPiece.getPosition().getFile() == 0 && (getInitialDirection(chessPiece) == 8 || getInitialDirection(chessPiece) == 9 || getInitialDirection(chessPiece) == 10 || getInitialDirection(chessPiece) == 11)) {

        } else if (chessPiece.getPieceType().equals(PieceType.KNIGHT) && chessPiece.getPosition().getFile() == 7 && (getInitialDirection(chessPiece) == 8 || getInitialDirection(chessPiece) == 9 || getInitialDirection(chessPiece) == 10 || getInitialDirection(chessPiece) == 11)) {

        }
    }

    private void moveFigures(ChessPiece chessPiece) {
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            Point newPosition = getNewPosition(chessPiece.getPosition(), getInitialDirection(chessPiece));
            if (chess.getChessBoard().getPiece(newPosition) != null && chessPiece.getPieceType().equals(PieceType.PAWN)) {
                break;
            } else if (chess.getChessBoard().getPiece(newPosition) != null && chessPiece.getPieceType().equals(PieceType.QUEEN)) {

            } else if (chess.getChessBoard().getPiece(newPosition) != null && chessPiece.getPieceType().equals(PieceType.KING)) {

            } else if (chess.getChessBoard().getPiece(newPosition) != null && chessPiece.getPieceType().equals(PieceType.BISHOP)) {

            } else if (chess.getChessBoard().getPiece(newPosition) != null && chessPiece.getPieceType().equals(PieceType.ROOK)) {

            } else if (chess.getChessBoard().getPiece(newPosition) != null && chessPiece.getPieceType().equals(PieceType.KNIGHT)) {

            } else {
                chess.getChessBoard().move(chessPiece.getPosition(), newPosition);
            }
        }
    }

    private void hideAllPiecesExcept(int file, int rank) {
        Random random = new Random();
        int x;
        for (int i = 16; i <= 31; i++) {
            x = random.nextInt(31);
            if (chess.getChessPieces()[x] == chess.getChessBoard().getPiece(new Point(file, rank))) {
            } else {
                chess.getChessBoard().remove(chess.getChessPieces()[x].getPosition());
            }
        }
    }

    private void randomlyChessPieces() {
        for (int j = 0; j <= 16; j++) {
            ChessPiece pieces = chess.getChessPieces()[j];
            Point randomSquire = getRandomFreeSquire();
            chess.getChessBoard().move(pieces.getPosition(), new Point(randomSquire.getFile(), randomSquire.getRank()));
        }
    }

    public void crazyWander(int file, int rank) {
        ChessPiece chessPiece = chess.getChessBoard().getPiece(new Point(file, rank));
        randomlyChessPieces();

        hideAllPiecesExcept(file, rank);

        for (int i = 0; i < 500; i++) {
            //PawnLogic

            //QueenLogic

            //KingLogic

            //BishopLogic

            //RookLogic

            //KnightLogic


            chessBashView.print();
            sleep();
        }
    }

    public void mixRandomlyChessPieces() {
        for (int i = 0; i <= 31; i++) {
            Random random = new Random();
            ChessPiece chessPiece = chess.getChessPieces()[i];
            chess.getChessBoard().move(chessPiece.getPosition(), new Point(random.nextInt(8), random.nextInt(8)));
        }
    }

    private Point getRandomFreeSquire() {
        Random random = new Random();
        Point[] freeSquires = chess.getChessBoard().getFreeSquires();
        int x = random.nextInt(freeSquires.length);
        return chess.getChessBoard().getFreeSquires()[x];
    }

    public void massacre(int mix) {
        Random random = new Random();
        for (int j = 0; j <= mix; j++) {
            ChessPiece piece = chess.getChessPieces()[random.nextInt(31)];
            Point randomSquire = getRandomFreeSquire();
            chess.getChessBoard().move(piece.getPosition(), new Point(randomSquire.getFile(), randomSquire.getRank()));
        }

        for (int i = mix; i <= 31; i++) {
            chess.getChessBoard().remove(chess.getChessPieces()[i].getPosition());
        }

        ChessPiece chessPiece = chess.getChessBoard().getChessPieces()[random.nextInt(chess.getChessBoard().getChessPiecesNumber())];


        int direction;
        direction = random.nextInt(8);
        for (int i = 0; i < 500; i++) {
            if (chessPiece.getPosition().getRank() == 7 && (direction == 0 || direction == 4 || direction == 6)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getRank() == 0 && (direction == 1 || direction == 5 || direction == 7)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getFile() == 0 && (direction == 2 || direction == 5 || direction == 6)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getFile() == 7 && (direction == 3 || direction == 4 || direction == 7)) {
                direction = random.nextInt(8);
            }

            Point newPosition = getNewPosition(chessPiece.getPosition(), direction);

            if (chess.getChessBoard().getPiece(newPosition) != null && chess.getChessBoard().getPiece(newPosition).getColor() != chessPiece.getColor()) {
                chess.getChessBoard().remove(newPosition);
                chess.getChessBoard().move(chessPiece.getPosition(), newPosition);
            } else if (chess.getChessBoard().getPiece(newPosition) != null && chess.getChessBoard().getPiece(newPosition).getColor() == chessPiece.getColor()) {
                direction = random.nextInt(8);
            } else {
                chess.getChessBoard().move(chessPiece.getPosition(), newPosition);
            }
            chessBashView.print();
            sleep();
        }
    }

    public void tag(int mix) {
        Random random = new Random();
        for (int j = 0; j <= mix; j++) {
            ChessPiece piece = chess.getChessPieces()[random.nextInt(31)];
            Point randomSquire = getRandomFreeSquire();
            chess.getChessBoard().move(piece.getPosition(), new Point(randomSquire.getFile(), randomSquire.getRank()));
        }

        for (int i = mix; i <= 31; i++) {
            chess.getChessBoard().remove(chess.getChessPieces()[i].getPosition());
        }

        ChessPiece chessPiece = chess.getChessBoard().getChessPieces()[random.nextInt(chess.getChessBoard().getChessPiecesNumber())];


        int direction;
        direction = random.nextInt(8);
        for (int i = 0; i < 500; i++) {
            if (chessPiece.getPosition().getRank() == 7 && (direction == 0 || direction == 4 || direction == 6)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getRank() == 0 && (direction == 1 || direction == 5 || direction == 7)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getFile() == 0 && (direction == 2 || direction == 5 || direction == 6)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getFile() == 7 && (direction == 3 || direction == 4 || direction == 7)) {
                direction = random.nextInt(8);
            }

            Point newPosition = getNewPosition(chessPiece.getPosition(), direction);

            if (chess.getChessBoard().getPiece(newPosition) != null && chess.getChessBoard().getPiece(newPosition).getColor() != chessPiece.getColor()) {
                chessPiece = chess.getChessBoard().getPiece(newPosition);
            } else if (chess.getChessBoard().getPiece(newPosition) != null && chess.getChessBoard().getPiece(newPosition).getColor() == chessPiece.getColor()) {
                direction = random.nextInt(8);
            } else {
                chess.getChessBoard().move(chessPiece.getPosition(), newPosition);
            }
            chessBashView.print();
            sleep();
        }
    }



    public void moveSnake(int file, int rank, int mix) {
        ChessPiece chessPiece = chess.getChessBoard().getPiece(new Point(file, rank));

        for (int j = 0; j <= mix; j++) {
            ChessPiece piece = chess.getChessPieces()[j];
            Point randomSquire = getRandomFreeSquire();
            chess.getChessBoard().move(piece.getPosition(), new Point(randomSquire.getFile(), randomSquire.getRank()));
        }

        for (int i = mix; i <= 31; i++) {
            if (chess.getChessPieces()[i] == chess.getChessBoard().getPiece(new Point(file, rank))) {
            } else {
                chess.getChessBoard().remove(chess.getChessPieces()[i].getPosition());
            }
        }

        Random random = new Random();
        int direction;
        direction = random.nextInt(8);

        for (int i = 0; i < 500; i++) {
            if (chessPiece.getPosition().getRank() == 7 && (direction == 0 || direction == 4 || direction == 6)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getRank() == 0 && (direction == 1 || direction == 5 || direction == 7)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getFile() == 0 && (direction == 2 || direction == 5 || direction == 6)) {
                direction = random.nextInt(8);
            } else if (chessPiece.getPosition().getFile() == 7 && (direction == 3 || direction == 4 || direction == 7)) {
                direction = random.nextInt(8);
            }

            Point newPosition = getNewPosition(chessPiece.getPosition(), direction);
            if (chess.getChessBoard().getPiece(newPosition) != null) {
                direction = random.nextInt(8);
            } else {
                chess.getChessBoard().move(chessPiece.getPosition(), newPosition);
            }
            chessBashView.print();
            sleep();
        }

    }

    public void move(int file, int rank) {
        ChessPiece chessPiece = chess.getChessBoard().getPiece(new Point(file, rank));
        for (int i = 0; i <= 31; i++) {
            if (chess.getChessPieces()[i] == chess.getChessBoard().getPiece(new Point(file, rank))) {
            } else {
                chess.getChessBoard().remove(chess.getChessPieces()[i].getPosition());
            }
        }

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int direction;
            direction = random.nextInt(4);
            Point newPosition = getNewPosition(chessPiece.getPosition(), direction);
            chess.getChessBoard().move(chessPiece.getPosition(), newPosition);
            chessBashView.print();
            sleep();
        }
    }

    private Point getNewPosition(Point position, int direction) {
        Point newPosition = position;
        if (direction == 0) {
            newPosition = moveUp(position);
        } else if (direction == 1) {
            newPosition = moveDown(position);
        } else if (direction == 2) {
            newPosition = moveLeft(position);
        } else if (direction == 3) {
            newPosition = moveRight(position);
        } else if (direction == 4) {
            newPosition = moveUpRight(position);
        } else if (direction == 5) {
            newPosition = moveDownLeft(position);
        } else if (direction == 6) {
            newPosition = moveUpLeft(position);
        } else if (direction == 7) {
            newPosition = moveDownRight(position);
        } else if (direction == 8) {
            newPosition = moveHorseDownLeft(position);
        } else if (direction == 9) {
            newPosition = moveHorseDownRight(position);
        } else if (direction == 10) {
            newPosition = moveHorseUpLeft(position);
        } else if (direction == 11) {
            newPosition = moveHorseUpRight(position);
        }
        return newPosition;
    }

    private Point moveUp(Point position) {
        if (position.getRank() < 7) {
            int newFileValue = position.getFile();
            int newRankValue = position.getRank() + 1;
            return new Point(newFileValue, newRankValue);
        } else {
            return position;
        }
    }

    private Point moveDown(Point position) {
        if (position.getRank() > 0) {
            int newFileValue = position.getFile();
            int newRankValue = position.getRank() - 1;
            return new Point(newFileValue, newRankValue);
        } else {
            return position;
        }
    }

    private Point moveLeft(Point position) {
        if (position.getFile() > 0) {
            int newFileValue = position.getFile() - 1;
            int newRankValue = position.getRank();
            return new Point(newFileValue, newRankValue);
        } else {
            return position;
        }
    }

    private Point moveRight(Point position) {
        if (position.getFile() < 7) {
            int newFileValue = position.getFile() + 1;
            int newRankValue = position.getRank();
            return new Point(newFileValue, newRankValue);
        } else {
            return position;
        }
    }

    private Point moveUpRight(Point position) {
        if (position.getFile() < 7 && position.getRank() < 7) {
            int newFileValue = position.getFile() + 1;
            int newRankValue = position.getRank() + 1;
            return new Point(newFileValue, newRankValue);
        } else {
            return position;
        }
    }

    private Point moveDownLeft(Point position) {
        if (position.getFile() > 0 && position.getRank() > 0) {
            int newFileValue = position.getFile() - 1;
            int newRankValue = position.getRank() - 1;
            return new Point(newFileValue, newRankValue);
        } else {
            return position;
        }
    }

    private Point moveDownRight(Point position) {
        if (position.getRank() > 0 && position.getFile() < 7) {
            int newFileValue = position.getFile() + 1;
            int newRankValue = position.getRank() - 1;
            return new Point(newFileValue, newRankValue);
        } else {
            return position;
        }
    }

    private Point moveUpLeft(Point position) {
        if (position.getFile() > 0 && position.getRank() < 7) {
            int newFileValue = position.getFile() - 1;
            int newRankValue = position.getRank() + 1;
            return new Point(newFileValue, newRankValue);
        } else {
            return position;
        }
    }

    private Point moveHorseUpRight(Point position) {
        if (position.getFile() < 7 && position.getRank() < 7) {
            int newFileValue = position.getFile() + 1;
            int newRankValue = position.getRank() + 2;
            if (newFileValue > 7 || newRankValue > 7) {
                return position;
            } else {
                return new Point(newFileValue, newRankValue);
            }
        } else {
            return position;
        }
    }

    private Point moveHorseDownLeft(Point position) {
        if (position.getFile() > 0 && position.getRank() > 0) {
            int newFileValue = position.getFile() - 1;
            int newRankValue = position.getRank() - 2;
            if (newFileValue < 0 || newRankValue < 0) {
                return position;
            } else {
                return new Point(newFileValue, newRankValue);
            }
        } else {
            return position;
        }
    }

    private Point moveHorseUpLeft(Point position) {
        if (position.getFile() > 0 && position.getRank() < 7) {
            int newFileValue = position.getFile() - 1;
            int newRankValue = position.getRank() + 2;
            if (newFileValue < 0 || newRankValue > 7) {
                return position;
            } else {
                return new Point(newFileValue, newRankValue);
            }
        } else {
            return position;
        }
    }

    private Point moveHorseDownRight(Point position) {
        if (position.getFile() < 7 && position.getRank() > 0) {
            int newFileValue = position.getFile() + 1;
            int newRankValue = position.getRank() - 2;
            if (newFileValue > 7 || newRankValue < 0) {
                return position;
            } else {
                return new Point(newFileValue, newRankValue);
            }
        } else {
            return position;
        }
    }

    private void sleep() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) { }
    }

}

