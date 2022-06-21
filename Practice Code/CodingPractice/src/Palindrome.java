import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String orS , rev="";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no. or String");

        orS = scan.nextLine();

        int length = orS.length();

        for(int i = length-1 ; i>=0;i--)
        {

            rev= rev+orS.charAt(i);
        }
        System.out.println("reverse"+rev);

        if(orS.equals(rev))
        {

            System.out.println("String is Palindrome"+orS);
        }
        else
        {
            System.out.println("String is not Palindrome"+orS);

        }

    }
}
