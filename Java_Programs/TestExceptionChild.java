// Complie time error program for Overriden method
//error program
//  overridden method does not throw IOException


    import java.io.*;
    class Parent{
      void msg(){System.out.println("parent");}
    }

    class TestExceptionChild extends Parent{
      void msg()throws IOException{
        System.out.println("TestExceptionChild");
      }
      public static void main(String args[]){
       Parent p=new TestExceptionChild();
       p.msg();
      }
    }

