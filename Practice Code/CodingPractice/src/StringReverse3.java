import java.util.Scanner;

public class StringReverse3 {

    public static void main(String[] args) {

        String reverse1="";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");

        String originalStr = scan.nextLine();

        int length =originalStr.length();

        for(int i = length-1;i>=0;i--)
        {
            reverse1 = reverse1 + originalStr.charAt(i);

        }

        System.out.println(reverse1);
    }
}
