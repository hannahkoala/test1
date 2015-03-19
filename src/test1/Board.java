package test1;

import java.awt.*;

/**
 * Created by hannah_koala on 2/11/15.
 */
public class Board {

    Tile[][] tiles = new Tile[3][3];

    public Board(){
        for (int x = 0 ; x < 3 ; x++){
            for (int y = 0 ; y < 3 ; y++){
                tiles[x][y] = new Tile(x, y);
            }
        }
    }

    public void paint(Graphics graphics){
        for (int x = 0 ; x < 3 ; x++){
            for (int y = 0 ; y < 3 ; y++){
                tiles[x][y].paint(graphics);
            }
        }
    }

}
