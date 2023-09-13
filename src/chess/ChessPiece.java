package src.chess;

import lombok.Getter;
import src.boardgame.Board;
import src.boardgame.Piece;
import src.boardgame.Position;

public abstract class ChessPiece extends Piece {

    @Getter
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    protected Boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);

        return p != null && p.getColor() != color;
    }
}
