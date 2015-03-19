package test1.events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by hannah_koala on 2/4/15.
 */
public class WindowListener extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
     }
}