import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, fact=1;

        System.out.println("Enter no. to calculate factorial");

        num=scan.nextInt();

        for(int i=1;i<=num;i++)
        {
            fact = fact * i;


        }

        System.out.println(fact);
    }
}
