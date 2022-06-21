import java.util.Scanner;

public class StringReverse2 {
    public static void main(String[] args) {

        String str;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String");
        str = scan.nextLine();

        String[] token = str.split("");//split method to print in reverse order

        for(int i= token.length-1; i>=0;i--)
        {
            System.out.print(token[i]);

        }


    }
}
