//Java Radio Button
//JOptionPane.showMessageDialog(this,"Welcome")l

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class SwingRadioButton1 extends JFrame implements ActionListener {

	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1;
	JCheckBox c1,c2,c3;
	JRadioButton r1,r2;

    JButton b1;

	ButtonGroup bg1;


	SwingRadioButton1()
	{
           l1 = new JLabel("Username");
		   		l1.setBounds(20,50,100,20);
		   		add(l1);

		   	t1= new JTextField();
				t1.setBounds(130,50,150,30);
		        add(t1);

		    l2 = new JLabel("Hobby");
		    l2.setBounds(20,100,90,20);
		    add(l2);

            c1 = new JCheckBox("Music");
            c1.setBounds(130,100,80,20);
            add(c1);

            c2= new JCheckBox("Cricket");
            c2.setBounds(210,100,90,20);
            add(c2);

            c3= new JCheckBox("Reading");
            c3.setBounds(300,100,100,20);
            add(c3);

            l3 = new JLabel("Gender");
            l3.setBounds(20,150,90,20);
            add(l3);

            r1 = new JRadioButton("Female");
            r1.setBounds(130,150,80,20);
            add(r1);

            r2 = new JRadioButton("Male");
            r2.setBounds(210,150,90,20);
            add(r2);

           bg1 = new ButtonGroup();
           bg1.add(r1);
           bg1.add(r2);


           b1 = new JButton("Proceed");
           b1.setBounds(140,200,100,50);
           b1.addActionListener(this);
           add(b1);


            l4 = new JLabel("Username:");
		   		l4.setBounds(50,250,200,20);
		   		add(l4);


		   l5 = new JLabel("Hobby:");
			   l5.setBounds(50,280,300,20);
		   	   add(l5);


		   l6 = new JLabel("Gender:");
			    l6.setBounds(50,310,100,20);
		   		add(l6);



         setSize(400,400);
         setLayout(null);
         setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
   {
	   StringBuilder sb1 = new StringBuilder();
          //username

          sb1.append("Username: "+t1.getText());
          l4.setText("Username: "+t1.getText());


  //Hobby

  StringBuilder sb2 = new StringBuilder();
  sb2.append("Hobby : ");
   if(c1.isSelected())
    {
         sb2.append(" Music");

    }

    if(c2.isSelected())
     {

        sb2.append("   Cricket");

     }

     if(c3.isSelected())
	 {

	 	  sb2.append("   Reading ");
	 }

    l5.setText(sb2.toString());

  //Gender

 StringBuilder sb3 = new StringBuilder();
  StringBuilder sb4 = new StringBuilder();
  if(r1.isSelected())
  {
      sb4.append("Gender: Female");
	  l6.setText("Gender: Female");
  }

  if(r2.isSelected())
    {
          sb4.append("Gender: Male");
  	  l6.setText("Gender: Male");
  }
  sb3.append(sb1.toString()+"\n");
  sb3.append(sb2.toString()+"\n");
  sb3.append(sb4.toString()+"\n");
JOptionPane.showMessageDialog(this ,sb3.toString());
 // JOptionPane.showMessageDialog(this , "Proceed to next Step dear "+t1.getText());




}
public static void main(String argc[])
{

	SwingRadioButton1 s1 = new SwingRadioButton1();

}

}