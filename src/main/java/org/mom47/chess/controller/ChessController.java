package org.mom47.chess.controller;

import org.fusesource.jansi.Ansi;
import org.mom47.chess.model.*;
import org.mom47.chess.view.ChessBashView;

import java.util.Random;

import static org.mom47.chess.controller.ChessController.Action.*;

public class ChessController {

    public enum Action {
        Up,
        Left,
        Right,
        Down,
        Enter,
        Escape
    }

    private Chess chess;
    private ChessBashView chessBashView;

    public ChessController(Chess chess, ChessBashView chessBashView) {
        this.chess = chess;
        this.chessBashView = chessBashView;
    }

    public void handleKey(Action action) {
        if (chess.selectedPiece == null) {
            int rank = chess.cursor.getRank();
            int file = chess.cursor.getFile();
            if (action == Up && rank < 7) {
                chess.cursor = chess.cursor.getUp();
            } else if (action == Left && file > 0) {
                chess.cursor = chess.cursor.getLeft();
            } else if (action == Right && file < 7) {
                chess.cursor = chess.cursor.getRight();
            } else if (action == Down && rank > 0) {
                chess.cursor = chess.cursor.getDown();
            } else if (action == ChessController.Action.Enter) {
                chess.selectedPiece = chess.getChessBoard().getPiece(chess.cursor);
                int length = chess.selectedPiece.getAvailablePaths(chess.getChessBoard()).length;
                ChessBoard chessBoard = chess.getChessBoard();
                Point[][] availablePaths = chess.selectedPiece.getAvailablePaths(chessBoard);
                for (int i = 0; i <= length - 1; i++) {
                    if (availablePaths[i] != null) {
                        chess.selectedPath = i;
                        chess.cursor = availablePaths[i][0];
                        break;
                    }
                }
            }

        } else {
            ChessBoard chessBoard = chess.getChessBoard();
            Point[][] availablePaths = chess.selectedPiece.getAvailablePaths(chessBoard);
            if (action == Up) {
                for (int i = 0; i <= availablePaths[chess.selectedPath].length - 1; i++) {
                    if (availablePaths[chess.selectedPath][i].equals(chess.cursor)) {
                        if (i + 1 <= availablePaths[chess.selectedPath].length - 1) {
                            chess.cursor = availablePaths[chess.selectedPath][i + 1];
                            break;
                        }
                    }
                }
            } else if (action == Left) {
                if (chess.selectedPath - 1 >= 0) {
                    chess.selectedPath = chess.selectedPath - 1;
                    if (availablePaths[chess.selectedPath] != null) {
                        chess.cursor = availablePaths[chess.selectedPath][0];
                    }
                }
            } else if (action == Right) {
                if (chess.selectedPath + 1 <= availablePaths.length - 1) {
                    chess.selectedPath = chess.selectedPath + 1;
                    if (availablePaths[chess.selectedPath].length != 0) {
                        chess.cursor = availablePaths[chess.selectedPath][0];
                    } else {
                        chess.selectedPath = chess.selectedPath - 1;
                    }
                }
            } else if (action == Down) {
                for (int i = 0; i <= availablePaths[chess.selectedPath].length - 1; i++) {
                    if (availablePaths[chess.selectedPath][i].equals(chess.cursor)) {
                        if (i - 1 >= 0) {
                            chess.cursor = availablePaths[chess.selectedPath][i - 1];
                            break;
                        }
                    }
                }
            } else if (action == ChessController.Action.Enter) {
                chess.getChessBoard().move(chess.selectedPiece.getPosition(), chess.cursor);
                chess.selectedPiece = null;
            }
        }

    }
}
