// calculator

// by inheritance
import javax.swing.*;
import java.awt.event.*;
class Calculator1 extends JFrame{
Double num=0.00,pnum=0.00,res=0.00;
String op =null;
Calculator1(){



// Textfield

JTextField t1 = new JTextField();
t1.setBounds(15,50,250,50);
add(t1);

//Button 1

JButton b1 = new JButton("1");
b1.setBounds(15,125,75,40);
b1.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

      if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
    {
		t1.setText("1");
	}

	else
	{

		t1.setText(t1.getText()+"1");
  }

	}




	});
add(b1);

//Button 2

JButton b2 = new JButton("2");
b2.setBounds(100,125,75,40);

b2.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){


		      if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
		    {
				t1.setText("2");
			}

	       else{

		      t1.setText(t1.getText()+"2");

	      }

	}




	});
add(b2);

//Button 3

JButton b3 = new JButton("3");
b3.setBounds(185,125,75,40);

b3.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){


		       if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
		     {
		 		t1.setText("3");
		 	}

	       else{

		     t1.setText(t1.getText()+"3");
		   }

	}




	});

add(b3);

//Button 4

JButton b4 = new JButton("4");
b4.setBounds(15,170,75,40);

b4.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

		 if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
				     {
				 		t1.setText("4");
				 	}

			       else{

				     t1.setText(t1.getText()+"4");
				   }


	}




	});
add(b4);

//Button 5

JButton b5 = new JButton("5");
b5.setBounds(100,170,75,40);

b5.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

		 if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
				     {
				 		t1.setText("5");
				 	}

			       else{

				     t1.setText(t1.getText()+"5");
				   }


	}




	});
add(b5);

//Button 6

JButton b6 = new JButton("6");
b6.setBounds(185,170,75,40);

b6.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

		 if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
				     {
				 		t1.setText("6");
				 	}

			       else{

				     t1.setText(t1.getText()+"6");
				   }

	}




	});

add(b6);

//Button 7

JButton b7 = new JButton("7");
b7.setBounds(15,215,75,40);

b7.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

		 if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
				     {
				 		t1.setText("7");
				 	}

			       else{

				     t1.setText(t1.getText()+"7");
				   }


	}




	});
add(b7);

//Button 8

JButton b8 = new JButton("8");
b8.setBounds(100,215,75,40);

b8.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

		 if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
				     {
				 		t1.setText("8");
				 	}

			       else{

				     t1.setText(t1.getText()+"8");
				   }


	}




	});

add(b8);

//Button 9

JButton b9 = new JButton("9");
b9.setBounds(185,215,75,40);
b9.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

		 if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
				     {
				 		t1.setText("9");
				 	}

			       else{

				     t1.setText(t1.getText()+"9");
				   }


	}




	});

add(b9);

//Button +

JButton b10 = new JButton("+");
b10.setBounds(15,260,75,40);

b10.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){
     pnum = Double.parseDouble(t1.getText());
		t1.setText("+");
		op="+";

	}




	});

add(b10);

//Button 0

JButton b11 = new JButton("0");
b11.setBounds(100,260,75,40);

b11.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

		 if(t1.getText().equals("+")||t1.getText().equals("-")||t1.getText().equals("*"))
				     {
				 		t1.setText("0");
				 	}

			       else{

				     t1.setText(t1.getText()+"0");
				   }


	}




	});

add(b11);

//Button =

JButton b12 = new JButton("=");
b12.setBounds(185,260,75,40);

b12.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){
       num = Double.parseDouble(t1.getText());

       if(op.equals("+")){
        res = pnum+num;
		t1.setText(String.valueOf(res));
	   }else if(op.equals("-")){
        res = pnum-num;
		t1.setText(String.valueOf(res));

      }else if(op.equals("*")){
        res = pnum*num;
		t1.setText(String.valueOf(res)); }
	}




	});
add(b12);

//Button -

JButton b13 = new JButton("-");
b13.setBounds(15,305,75,40);

b13.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

     pnum = Double.parseDouble(t1.getText());
		t1.setText("-");

		op = "-";

	}




	});

add(b13);

//Button C

JButton b14 = new JButton("C");
b14.setBounds(100,305,75,40);

b14.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

		t1.setText(" ");

	}




	});

add(b14);

//Button *

JButton b15 = new JButton("*");
b15.setBounds(185,305,75,40);

b15.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){
       pnum = Double.parseDouble(t1.getText());
		t1.setText("*");
		op="*";

	}




	});

add(b15);




//layout
	setSize(350,400);
	setLayout(null);
	setVisible(true);





}





public static void main(String argc[]){

Calculator1 c1 = new Calculator1();


}

}

