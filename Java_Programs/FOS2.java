// java FileOutputStream : write byte

 import java.io.FileOutputStream;

 public class FOS2{

	 public static void main(String args[])
	 {
		 try
		 {
		 FileOutputStream fout = new FileOutputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\FOS2.txt");

		 fout.write(85);
		 fout.close();
		 System.out.println("Success");
	     }
	     catch(Exception e ){System.out.println(e);}

 }
}
