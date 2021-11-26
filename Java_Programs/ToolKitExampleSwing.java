
//Java  AWT SWING Toolkit

import java.awt.*;
import javax.swing.*;

public class ToolKitExampleSwing{

public static void main(String args[])
{

 Toolkit t = Toolkit.getDefaultToolkit();

 System.out.println("Screen Resolution = "+t.getScreenResolution());

 Dimension d = t.getScreenSize();

 System.out.println("Screen Width = "+d.width);

 System.out.println("Screen Height = "+d.height);



}



}