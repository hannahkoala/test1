package test1;

import test1.events.WindowListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by hannah_koala on 2/4/15.
 */
public class Window {
    public Window(){

        JFrame uiFrame = new JFrame();
        uiFrame.setVisible(true);
        uiFrame.setSize(800, 600);
        uiFrame.setTitle("Test Frame");
        uiFrame.setLocationRelativeTo(null);
        uiFrame.addWindowListener(new WindowListener());
        uiFrame.getContentPane().add(new CanvasAdapter());
    }

}
