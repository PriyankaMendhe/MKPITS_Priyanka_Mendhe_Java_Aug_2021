 //Design an elevator using AWT or Swing.
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.util.Scanner;
 import javafx.scene.layout.BorderPane;

 public class ElevatorP1 extends JFrame {


     JPanel p1,p2,p3;
     JLabel l1,l2,l3,l4,l5;
     JToggleButton t1,t2,t3,t4,t5,t6,t7,t8;
     JButton b1,b2;

     ElevatorP1()

     {
         //panel p1 add 'update floor number'
         p1 = new JPanel();
         p1.setBounds(20,20,100,100);
         p1.setBackground(Color.lightGray);
         add(p1);

         l1 = new JLabel("5",JLabel.CENTER);
         l1.setFont(new Font("Serif", Font.PLAIN, 80));
         p1.add(l1);

        // panel 2 to show elevator going up/down
         p2 = new JPanel();
         p2.setBounds(20,140,100,100);
         p2.setBackground(Color.lightGray);
         add(p2);

         //ImageIcon icon  =  new ImageIcon("D:/t14up.png");
         //l4 = new JLabel("",icon,JLabel.CENTER);
        // l4.setIcon(icon);
        // p2.add(l4);

          //panel 2 for showing status of FAN, LIGHT, DOOR
          p3 = new JPanel();
          p3.setBounds(20,260,100,90);
          p3.setBackground(Color.lightGray);
          add(p3);

          l2= new JLabel("FAN OFF");
          l2.setBounds(25,270,80,20);
          p3.add(l2);

          l3= new JLabel("LIGHT OFF");
          l3.setBounds(25,310,110,20);
          p3.add(l3);

          l4= new JLabel("DOOR OPEN");
          l4.setBounds(25,350,140,20);
          p3.add(l4);


         //Buttons from 1st floor to 6th floor
         t1 = new JToggleButton("1",false);
         t1.setBounds(140,20,50,40);
         t1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 l1.setText("1");
             }
         });
         add(t1);

         t2 = new JToggleButton("2",false);
         t2.setBounds(200,20,50,40);
         t2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 l1.setText("2");
             }
         });

         add(t2);
         t3 = new JToggleButton("3",false);
         t3.setBounds(140,90,50,40);
         t3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 l1.setText("3");
             }
         });
         add(t3);

         t4 = new JToggleButton("4",false);
         t4.setBounds(200,90,50,40);
         t4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 l1.setText("4");
             }
         });
         add(t4);

         t5 = new JToggleButton("5",false);
         t5.setBounds(140,160,50,40);
         t5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 l1.setText("5");
             }
         });
         add(t5);

         t6 = new JToggleButton("6",false);
         t6.setBounds(200,160,50,40);
         t6.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 l1.setText("6");
             }
         });
         add(t6);

         //functionality Buttons
        // L - Lights ON/OFF (Pressing this switch should display whether the light is on or off in the mini panel)
         t7 = new JToggleButton("L",false);
         t7.setBounds(140,230,50,40);
         t7.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 if(t7.isSelected())
                 {
                     l3.setText("LIGHT IS ON");

                 }
                 else
                 {
                     l3.setText("LIGHT IS OFF");

                 }

             }

         });
         add(t7);

        // F - Fan ON/OFF (Pressing this switch should display whether the fan should on or off in the mini panel)
         t8 = new JToggleButton("F",false);
         t8.setBounds(200,230,50,40);
         t8.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(t8.isSelected()) {

                     l2.setText("FAN ON");


                 }
                 else
                 {
                     l2.setText("FAN OFF");

                 }
             }
         });
         add(t8);

         // O - Door Open (Pressing this switch should Keep the door open)
         b1 = new JButton("O");
         b1.setBounds(140,300,50,40);
         b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 l4.setText("DOOR OPEN");
             }
         });
         add(b1);

         // C - Door Close (Pressing this switch should close the door)
         b2 = new JButton("C");
         b2.setBounds(200,300,50,40);
         b2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 l4.setText("DOOR CLOSE");
             }
         });
         add(b2);

         //label to show door Opening or closing
         l5 = new JLabel("Status");
         l5.setBounds(25,380,300,20);
         add(l5);

BorderPane b1 = new BorderPane();

// create a scene
            Scene scene = new Scene(b1, 200, 200);

            // set the scene
            stage.setScene(scene);

            stage.show();




 //frame
       setSize(315,480);
       setTitle("Elevator");
       setLayout(null);
       setVisible(true);
setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
     }

     public static void main(String args[])
     {

         ElevatorP1 e1 = new ElevatorP1();
         e1.ask();


     }

     //variables
 	final int maxFloor=6;
 	final int minFloor=1;
 	int curFloor=1;
 	int desFloor=0;

 	//functions

 	void ask()
 	{

        delay(2000);

     //toggle button from floor 1 to floor 6

 		if(t1.isSelected())
 		{
 			desFloor=Integer.parseInt(t1.getText());

 		}else if(t2.isSelected()){

 			desFloor=Integer.parseInt(t2.getText());

          }else if(t3.isSelected()) {

 		 	desFloor=Integer.parseInt(t3.getText());

         }else if(t4.isSelected())
 		 {
 		 	desFloor=Integer.parseInt(t4.getText()) ;

          }else if(t5.isSelected()){

 		 	desFloor=Integer.parseInt(t5.getText());


 		 }else if(t6.isSelected())
 		 {
 		 	desFloor=Integer.parseInt(t6.getText());

 		 }


         delay(1000);


 		if(desFloor < 0 || desFloor > 6 || desFloor == curFloor){

         //input can be same as current floor or out of Range
          ask();// ask again to input floor no.


 		}else
 		{
 			     System.out.println("Door Closing...");
 			     l5.setText("Door Closing...");
 			     delay(1000);//to close the door

 			     if(desFloor < curFloor){

 					   goDown();
 					   delay(1000);

 				 }else if(desFloor > curFloor){

 					   goUp();
 					   delay(1000);
 				 }


 	}

 	System.out.println("Door Opening");
 	l5.setText("Door Opening...");

    ask();


 	}

    //Delay Function
 	void delay(int ms){
 			try{

 				Thread.sleep(ms);


 				}catch(Exception ee){}

   }



       //goUp Function
 		void goUp()// if currentFloor < destination floor is true go-up
 		{
 			upDirectionImage();


 			 while(curFloor++ < desFloor){// 1st check the condition then inside bracket +1 value of Curfloor and Show on Label


 			 l1.setText(String.valueOf(curFloor));
 			 System.out.println("going up....Current floor:   "+curFloor);
 			 l5.setText("going up....Current floor:   "+curFloor);
 			 delay(1000);//time for one floor to next floor
 		   }

 		   curFloor--;//at end of loop -1 value of curFloor

 		}


 		void goDown()// if currentFloor > destination floor is true go-Down
 		{
 			downwardImage();
 			while(curFloor-- >desFloor){

 			l1.setText(String.valueOf(curFloor));// showing currernt FLoor on Panel
 			System.out.println("going down....Current floor: "+curFloor +" "+ "  Destination Floor | "+desFloor );
 			l5.setText("going down....Current floor: "+curFloor +" "+ "  Destination Floor | "+desFloor );// label at bottom
 			delay(1000);
 		    }

 		    curFloor++;
 		}



 	void downwardImage()
 	{

                 ImageIcon icon  =  new ImageIcon("D:/t4.png");// downward arrow image
 		         l4 = new JLabel("",icon,JLabel.CENTER);
 		         l4.setIcon(icon);
                 p2.add(l4);


 	}

     void upDirectionImage()
     {

 		        ImageIcon icon  =  new ImageIcon("D:/t12.png");// upward arrow image
 				l4 = new JLabel("",icon,JLabel.CENTER);
 				l4.setIcon(icon);
                p2.add(l4);

 	}
 }
