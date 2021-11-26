     //Popup Menu Swing

	 import java.awt.*;
	 import java.awt.event.*;
	 import javax.swing.*;
	 class PopupMenuExampleSwing{

	 	PopupMenuExampleSwing()
	 	{

	 		JFrame f = new JFrame("PopupMenuExample");

	 		JPopupMenu popupmenu = new JPopupMenu("Edit");

	 		JMenuItem cut = new JMenuItem("Cut");
	 		cut.setActionCommand("Cut");

	 		JMenuItem copy = new JMenuItem("Copy");
	 		copy.setActionCommand("Copy");

	 		JMenuItem paste = new JMenuItem("Paste");
	 		paste.setActionCommand("Paste");

	 		popupmenu.add(cut);
	 		popupmenu.add(copy);
	 		popupmenu.add(paste);


           f.addMouseListener(new MouseAdapter(){

	 			public void mouseClicked(MouseEvent e){

	 				popupmenu.show(f, e.getX(), e.getY());


	 			}




	 		});





	 		f.add(popupmenu);
	 		f.setSize(400,400);
	 		f.setLayout(null);
	 		f.setVisible(true);



	 	}

	 public static void main(String args[]){

	 	PopupMenuExampleSwing p1 = new PopupMenuExampleSwing();


	 }

}