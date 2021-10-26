import java.util.StringTokenizer;
    public class StringToken3{
     public static void main(String args[]){
       StringTokenizer st = new StringTokenizer("Welcome,to,Mkpits,solution",",");// by ,
         
             System.out.println(st.nextToken());// it takes only first word
         
       }
    }
