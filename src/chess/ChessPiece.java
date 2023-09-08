package src.chess;

import lombok.Getter;
import src.boardgame.Board;
import src.boardgame.Piece;

public class ChessPiece extends Piece {

    @Getter
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
