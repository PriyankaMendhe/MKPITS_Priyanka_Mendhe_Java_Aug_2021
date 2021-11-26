//list of text item , chhose one or multiple option
//Java AWT List Example without ActionListener
//Swing
import java.awt.*;
import javax.swing.*;

class AWTListSwing{

AWTListSwing()
{

    JFrame f = new JFrame("List Example");

    String Item[] ={"Item 1", "Item 2", "Item 3", "Item 4","Item 5"};

    JList l1 = new JList(Item);

    l1.setBounds(100,50,75,75);

   l1.setSelectedIndex(2);

    f.add(l1);


    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);



}

public static void main(String argc[])
{

     AWTListSwing aw = new AWTListSwing();
}

}