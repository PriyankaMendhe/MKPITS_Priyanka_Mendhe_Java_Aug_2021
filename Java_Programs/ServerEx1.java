import java.io.*;
import java.net.*;
public class ServerEx1 {
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(6666);
            System.out.println("Waiting for Client to Connect... ");

            Socket s=ss.accept();//establishes connection
            System.out.println("Client Connected.");

            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();//readUTF --> Converted Bytes to String
            System.out.println("message= "+str);

            /*DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Message from Server");*/

            ss.close();
        }catch(Exception e){System.out.println(e);}
    }
}