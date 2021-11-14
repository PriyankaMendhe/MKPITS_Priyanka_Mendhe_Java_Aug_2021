// Java AWT Pannel Example

import java.awt.*;
public class PanelExample{

PanelExample()
{

 Frame f = new Frame("Panel Example");

 Panel panel = new Panel();
//Grey Panel
 panel.setBounds(40,80,200,200);
 panel.setBackground(Color.gray);

// Yellow Button
Button b1 = new Button("Button 1");
b1.setBounds(50,100,80,30);
b1.setBackground(Color.yellow);
panel.add(b1);

// Green Button
Button b2 = new Button("Button 2");
b2.setBounds(50,150,80,30);
b2.setBackground(Color.yellow);
panel.add(b2);




f.add(panel);
f.setSize(600,600);
f.setLayout(null);
f.setVisible(true);


}

public static void main(String args[]){

PanelExample p = new  PanelExample();

}
}