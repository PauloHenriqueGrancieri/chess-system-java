package src.boardgame;

import lombok.AccessLevel;
import lombok.Getter;

public class Piece {

    protected Position position;

    @Getter(AccessLevel.PROTECTED)
    protected Board board;

    public Piece(Board board) {
        this.board = board;
    }
}
