package test1;

import java.awt.*;

/**
 * Created by hannah_koala on 2/11/15.
 */
public class Tile {

    int x;
    int y;

    public Tile(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawRect(x * 100, y * 100, 100, 100);
    }
}
