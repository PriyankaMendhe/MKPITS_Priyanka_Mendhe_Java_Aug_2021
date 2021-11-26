//Java AWT/Swing Toolkit Example: beep()

    import java.awt.event.*;
    import java.awt.*;
    import javax.swing.*;
    public class ToolkitExampleBeepSwing {
    public static void main(String[] args) {
        JFrame f=new JFrame("ToolkitExample");
        JButton b=new JButton("beep");
        b.setBounds(50,100,100,30);


        b.addActionListener(new ActionListener(){
		            public void actionPerformed(ActionEvent e){

		                Toolkit.getDefaultToolkit().beep();
		            }
		        });

        f.add(b);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
    }
