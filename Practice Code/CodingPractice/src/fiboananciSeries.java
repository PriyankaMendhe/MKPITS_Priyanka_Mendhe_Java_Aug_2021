import java.util.Scanner;

public class fiboananciSeries {
    public static void main(String[] args) {

        int a=0, b=1, c , noOfterms;

        System.out.println("Enter no.of terms you want in series");

        Scanner scan = new Scanner(System.in);

        noOfterms = scan.nextInt();

        for(int i=0;i<noOfterms;i++)
        {

            System.out.println(a);

            c=a+b;

            a=b;

            b=c;
        }


    }
}
