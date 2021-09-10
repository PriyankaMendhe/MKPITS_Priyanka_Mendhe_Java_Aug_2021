import java.util.*;
class StaticEx
{
   static int num=20;
  public  static  void main(String absv[])
   {


      System.out.println("num " + num);

      num = 50 ;

      System.out.println("num " + num);

      StaticEx s1 = new StaticEx();

      s1.num = 70 ;

      System.out.println("num " + num);

      StaticEx s2 = new StaticEx();

      s2.num = 80 ;

      System.out.println("num " + s2.num);

     }
 }
