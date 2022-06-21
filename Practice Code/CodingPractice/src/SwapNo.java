import java.util.Scanner;

public class SwapNo {

    public static void main(String[] args) {

        int x, y, temp;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x and Y");

        x=scan.nextInt();
        y=scan.nextInt();

        System.out.println("Before Swapping: X "+x+"Y:"+y);

        temp=x;
        x=y;

        y=temp;
        System.out.println("After Swapping: X "+x+"Y:"+y);


    }
}
