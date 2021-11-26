//Java AWT Swing Toolkit Example: Change TitleBar Icon

    import java.awt.*;
    import javax.swing.*;
    class ToolkitTitleBarIConSwing{

    ToolkitTitleBarIConSwing(){

    JFrame f=new JFrame();

    Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");

    f.setIconImage(icon);

    f.setLayout(null);
    f.setSize(400,400);
    f.setVisible(true);
    }

    public static void main(String args[]){
    new ToolkitTitleBarIConSwing();

    }
    }
