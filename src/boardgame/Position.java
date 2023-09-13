package src.boardgame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public class Position {

    @Getter
    @Setter
    private Integer row;

    @Getter
    @Setter
    private Integer column;

    @Override
    public String toString(){
        return row + ", " + column;
    }

    public void setValues(Integer row, Integer column){
        this.row = row;
        this.column = column;
    }

}
