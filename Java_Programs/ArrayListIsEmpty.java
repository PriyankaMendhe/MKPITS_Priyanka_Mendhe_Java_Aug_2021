 //isEmpty() method

    import java.util.*;
     class ArrayListIsEmpty{

            public static void main(String [] args)
            {
              ArrayList<String> al=new ArrayList<String>();
              System.out.println(al);
              System.out.println("Is ArrayList Empty: "+al.isEmpty());
              al.add("Ravi");
              al.add("Vijay");
              al.add("Ajay");
              System.out.println("After Insertion");
              System.out.println(al);
              System.out.println("Is ArrayList Empty: "+al.isEmpty());   // give true of false value isEmpty();
           }
        }
