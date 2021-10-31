//Registration Form
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class RegdFormEvent extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1;
	Checkbox c1,c2,c3,c4;
	CheckboxGroup cbg1;
	Button b1;
	TextArea ta1;

	RegdFormEvent()
	{
		 //Username
		 l1 = new Label("Username");
		 l1.setBounds(20,40,80,25);
		 add(l1);

		 t1 = new TextField();
		 t1.setBounds(100,40,180,25);
		 add(t1);

        //Gender CheckboxGroup

         l2 = new Label("Gender");
         l2.setBounds(20,70,80,25);
         add(l2);

         cbg1 = new CheckboxGroup();
         c1 = new Checkbox("Male",cbg1,true);
         c1.setBounds(100,70,80,25);
         add(c1);

         c2 = new Checkbox("Female",cbg1,false);
         c2.setBounds(180,70,80,25);
         add(c2);

        //Hobby

        l3 = new Label("Hobby");
        l3.setBounds(20,100,80,25);
        add(l3);

        c3= new Checkbox("Music");
        c3.setBounds(100,100,80,25);
        add(c3);

        c4 = new Checkbox("Cricket");
        c4.setBounds(180,100,80,25);
        add(c4);

        //Button

        b1 = new Button("OK");
        b1.setBounds(120,150,80,25);
        b1.addActionListener(this);
        add(b1);

      //Info

      l4 = new Label("Info");
      l4.setBounds(20,200,70,25);
      add(l4);

      ta1 = new TextArea();
      ta1.setBounds(90,200,300,100);
      add(ta1);

		//set Title, Size,layout

		setSize(500,400);
		setLayout(null);
		setVisible(true);
		setTitle("Registration Form");

	}

	public void actionPerformed(ActionEvent ae)
	{

           StringBuilder sb = new StringBuilder();

           String username = t1.getText();
           sb.append("Username : "+username +"\n");
          // ta1.setText("Username : "+username);

//Gender
           if(c1.getState()==true)
           { //ta1.setText("Gender: Male");

           sb.append(" Gender: Male "+"\n");

           }

           if(c2.getState()==true)
           {//ta1.setText("Gender: Female");// print only 1 line

             sb.append(" Gender: Female" +"\n");// String builder we can print total info
           }
//Hobby


          if((c3.getState()==true)&&(c4.getState()==true))
          {

			   sb.append(" Hobby: Music, Cricket"+" \n");

		  }else
		  {

			      if(c3.getState()==true)
				 		   { //ta1.setText("Hobby: Music");

				 		    sb.append(" Hobby: Music"+" \n");

				 		   }

				 		   if(c4.getState()==true)
				 		   {//ta1.setText("Hobby: Cricket");

				 		   sb.append(" Hobby: Cricket"+" \n");

		                   }


			}




         ta1.setText(sb.toString());





	}




public static void main(String argc[]){

RegdFormEvent f = new RegdFormEvent();


}

}

