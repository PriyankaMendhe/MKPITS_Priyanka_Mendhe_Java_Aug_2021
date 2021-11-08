import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class SwingCombo1 extends JFrame{


  SwingCombo1(){

	  JLabel label = new JLabel("Language");
	  label.setHorizontalAlignment(JLabel.CENTER);
      label.setSize(400,400);
      add(label);

       String languages[]={"C","C++","C#","Java","PHP"};
	          JComboBox cb1 = new JComboBox(languages);
	           cb1.setBounds(200, 100,90,20);
	           add(cb1);

        JButton b=new JButton("Show");
        b.setBounds(200,150,75,20);

         b.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {

		       String data = "Programming language Selected: "+ cb1.getItemAt(cb1.getSelectedIndex());
		       label.setText(data);
		    }
		    });
       add(b);



	           setLayout(null);
	           setSize(500,500);
	           setVisible(true);




  }








public static void main(String argc[]){

SwingCombo1 c1 = new SwingCombo1();


}

}