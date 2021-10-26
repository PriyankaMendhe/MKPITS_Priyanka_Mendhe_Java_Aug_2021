import java.util.StringTokenizer;
    public class StringToken2{
     public static void main(String args[]){
       StringTokenizer st = new StringTokenizer("Welcome,to,Mkpits,solution",",");// by ,
         while (st.hasMoreTokens()) {
             System.out.println(st.nextToken());
         }
       }
    }
