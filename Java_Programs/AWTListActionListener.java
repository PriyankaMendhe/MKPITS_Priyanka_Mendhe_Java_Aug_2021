////list of text item , chhose one or multiple option
//Java AWT List Example without ActionListener

import java.awt.*;
import java.awt.event.*;
class AWTListActionListener{



	AWTListActionListener()
	{

		Frame f = new Frame("List with Action Listener");

		 Label label = new Label( );

		label.setAlignment(Label.CENTER);
		label.setSize(500,100);
		f.add(label);


		//list l1 select only one option
		List l1 = new List(4,false);
		l1.setBounds(100,100,70,70);
		l1.add("C");
		l1.add("C++");
		l1.add("Java");
		l1.add("php");
        f.add(l1);

        //list l2 select only one option
				List l2 = new List(4,true);
				l2.setBounds(100,200,70,70);
				l2.add("Turbo C++");
				l2.add("Spring");
				l2.add("Hibernet");
				l2.add("CodeIgniter");
		        f.add(l2);

      Button b = new Button("Show");

	  		b.setBounds(200,150,80,30);

	  		  b.addActionListener(new ActionListener() {
	  		              public void actionPerformed(ActionEvent e) {

							  String data = "Programming language Selected: "+l1.getItem(l1.getSelectedIndex());//getSelectedItem (give 1 item)

                              data += ", Framework Selected:";


                              for(String frame: l2.getSelectedItems())//getSlectedItems(gives multiple item list)
                              {

								  data += frame + "";
							   }

	  		               label.setText(data);
	  		               }
	               });

	  		f.add(b);


     f.setSize(500,500);
     f.setLayout(null);
     f.setVisible(true);

	}




public static void main(String argc[]){

	AWTListActionListener aw = new AWTListActionListener();

}}