import java.io.*;
import java.net.*;

class ClientSide
{

public static void main(String args[])throws Exception
{

  Socket s = new Socket("localhost",2000);
  System.out.println("Client is sending Request.........");

   for(;;)//infinite for loop
    {
  	  DataInputStream dis = new DataInputStream(System.in);
  	  String str = dis.readLine();
  	   PrintStream ps = new PrintStream(s.getOutputStream());
  	   ps.println(str);



  	  DataInputStream dis1 = new DataInputStream(s.getInputStream());
  	  String str1 = dis1.readLine();
  	  System.out.println("Server-->   "+str1);
  	  if(str.equals("Bye")){

  		  System.exit(0);
  		  //dis.close();
  		 // dis1.close();
  		  //ps.close();
  		  //s.close();
  		  //ss.close();


  		  }



}

}



}