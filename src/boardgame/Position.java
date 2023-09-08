package src.boardgame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Position {

    private Integer row;
    private Integer column;

    @Override
    public String toString(){
        return row + ", " + column;
    }

}
