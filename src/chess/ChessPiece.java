package src.chess;

import lombok.Getter;
import src.boardgame.Board;
import src.boardgame.Piece;
import src.boardgame.Position;

public abstract class ChessPiece extends Piece {

    @Getter
    private Color color;

    @Getter
    private Integer moveCount = 0;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public void increaseMoveCount(){
        moveCount++;
    }
    public void decreaseMoveCount(){
        moveCount--;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected Boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);

        return p != null && p.getColor() != color;
    }
}
