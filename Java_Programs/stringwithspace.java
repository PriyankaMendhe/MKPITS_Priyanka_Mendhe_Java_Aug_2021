//Accept name with Space

import java.util.Scanner;

public class stringwithspace {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
          String s;
          System.out.println("enter no");
        int i = scan.nextInt();
         System.out.println("enter double no");
        double d = scan.nextDouble();
       System.out.println("enter string");
        s= scan.nextLine();
        s += scan.nextLine();
        scan.close();

        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }

}