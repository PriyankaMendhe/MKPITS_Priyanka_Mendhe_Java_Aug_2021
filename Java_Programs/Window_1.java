import javax.swing.*;
import java.awt.*;

public class Window_1 {
    Frame f;
    JButton red, green, yellow;
    Window wob;


    Window_1()
    {
        f = new Frame();
        wob = new Window(f);
        red = new JButton();
        yellow = new JButton();
        green =  new JButton();

        wob.add(red, BorderLayout.NORTH);
        wob.add(green, BorderLayout.SOUTH);
        wob.add(yellow, BorderLayout.WEST);

        wob.setSize(800,800);
        wob.setVisible(true);





    }

    public static void main(String args[])
    {
        new Window_1();

    }
}
