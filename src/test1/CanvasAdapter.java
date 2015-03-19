package test1;

import java.awt.*;

/**
 * Created by hannah_koala on 2/11/15.
 */
public class CanvasAdapter extends Canvas {

    public void paint(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, (int) getSize().getWidth(), (int) getSize().getHeight());
        Board board = new Board();
        board.paint(graphics);
    }
}
