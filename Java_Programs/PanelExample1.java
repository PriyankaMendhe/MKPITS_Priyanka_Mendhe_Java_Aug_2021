import java.awt.*;
public class PanelExample1 {
    PanelExample1()
    {
        Frame f= new Frame("Panel Example");
        Panel panel=new Panel();
        //Panel 1
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.gray);

        Button b1=new Button("Button 1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);
        panel.add(b1);

        Button b2=new Button("Button 2");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.green);
        panel.add(b2);


        f.add(panel);

         //Panel 2
        Panel panel1=new Panel();
        panel1.setBounds(250,80,200,200);
        panel1.setBackground(Color.orange);

        Button b11=new Button("Button 11");
        b11.setBounds(50,100,80,30);
        b11.setBackground(Color.yellow);
        panel1.add(b11);// add button in panel

        Button b21=new Button("Button 21");
        b21.setBounds(100,100,80,30);
        b21.setBackground(Color.green);
        panel1.add(b21);// add button in panel

        f.add(panel1);//add panel in Frame


        f.setSize(800,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new PanelExample1();
    }
}

