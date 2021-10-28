import java.awt.*;
import java.awt.event.*;

class AnnEvent2 extends Frame{
    TextField tf;
    AnnEvent2(){

        tf=new TextField();
        tf.setBounds(60,50,170,20);

        Button b=new Button("click me");
        b.setBounds(100,120,80,30);


        b.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                tf.setText("welcome");
                                }
                            });
        Button b1=new Button("clear");
        b1.setBounds(100,160,80,30);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });


        add(b);add(tf);add(b1);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
      AnnEvent2 a =  new AnnEvent2();
    }
}
