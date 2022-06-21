import java.util.Scanner;

public class SwapNo2 {

    public static void main(String[] args) {

        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x and Y");

        x = scan.nextInt();

        y= scan.nextInt();

        System.out.println("Before Swapping: X "+x+"Y:"+y);

        x = x +y ;//2+3=5
        y=x-y;// 5-3 =2 y=2;

        x=x-y;//5-2 =3 x=3;

        System.out.println("Aftee Swapping: X "+x+"Y:"+y);

    }
}
