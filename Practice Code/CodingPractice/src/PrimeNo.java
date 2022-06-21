import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        int num;

        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter no. to check prime or not");

        num = scan.nextInt();

        for(int i=2;i<=num; i++) {

            if (num % i == 0) {

                if(num==i)
                {
                    System.out.println("Number is prime No: "+num);
                    break;


                }
                else
                {
                    System.out.println("No.is not Prime");
                    break;
                }


            }


        }

    }
}
