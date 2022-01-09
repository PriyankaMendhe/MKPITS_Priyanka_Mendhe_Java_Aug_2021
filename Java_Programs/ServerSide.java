import java.io.*;
import java.net.*;

class ServerSide
{

public static void main(String args[])throws Exception
{

  System.out.println("Server is ready at port no. 2000...........");
  ServerSocket ss = new ServerSocket(2000);

  Socket s = ss.accept();
  System.out.println("Client is Connected..");

  for(;;)//infinite for loop
  {
	  DataInputStream dis = new DataInputStream(s.getInputStream());
	  String str = dis.readLine();
	  System.out.println("Client-->  "+str);

	  PrintStream ps = new PrintStream(s.getOutputStream());
	  DataInputStream dis1 = new DataInputStream(System.in);
	  String str1 = dis1.readLine();
	  ps.println(str1);
	  if(str1.equals("Bye")){

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