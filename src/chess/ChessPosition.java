package src.chess;

import lombok.Getter;
import src.boardgame.Position;

@Getter
public class ChessPosition {

    private Character column;
    private Integer row;

    public ChessPosition(Character column, Integer row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }

        this.column = column;
        this.row = row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString(){
        return String.valueOf(column) + row;
    }
}
