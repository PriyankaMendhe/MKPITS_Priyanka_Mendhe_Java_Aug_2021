//Java Swing Scrollbar Example with AdjustmentListener

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

    class ScrollbarExampleSwing{

         ScrollbarExampleSwing(){

                JFrame f= new JFrame("Scrollbar Example");

                final JLabel label = new JLabel("Vetical Scrollbar Value IS: ", JLabel.CENTER);
                //label.setAlignment(JLabel.CENTER);
                label.setSize(400,100);// set on top




                final Scrollbar s=new Scrollbar();
                s.setBounds(100,100, 50,100);

                f.add(s);f.add(label);

                f.setSize(400,400);
                f.setLayout(null);
                f.setVisible(true);

                s.addAdjustmentListener(new AdjustmentListener() {
                    public void adjustmentValueChanged(AdjustmentEvent e) {
                       label.setText("Vertical Scrollbar value is:"+ s.getValue());
                    }
                });
             }
    public static void main(String args[]){
    new ScrollbarExampleSwing();
    }
    }
