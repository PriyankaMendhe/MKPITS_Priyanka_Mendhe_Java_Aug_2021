import java.awt.*;
public class Test2 extends Frame{

    Button b1, b2;
   Test2() {

       b1 = new Button("OK");
       b1.setBounds(100, 100, 30, 25);
       add(b1);

       b2 = new Button("Proceed");
       b2.setBounds(50, 200, 100, 25);
       add(b2);



       setLayout(null);
       setVisible(true);
       setSize(300, 300);
   }

    public static void main(String args[])
    {
        Test2 t1 = new Test2();

    }
}
