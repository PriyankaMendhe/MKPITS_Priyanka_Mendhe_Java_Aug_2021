import  java.util.*;
public class StringToken4 {
    public static void main(String[] args) {
      String str="welcome to java programming";
      String arr[]=new String[4];
      StringTokenizer st=new StringTokenizer(str," ");
      int i=0;
      while (st.hasMoreTokens())//checks if there is more tokens available.
      {
         // System.out.println(st.nextToken());
          arr[i]=st.nextToken();//returns the next token from the StringTokenizer object.
          i=i+1;
      }
      for( i=0;i<4;i++)
      {
          System.out.println(arr[i]);
      }
    }
}
