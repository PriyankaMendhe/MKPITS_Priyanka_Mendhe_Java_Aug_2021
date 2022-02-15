import java.util.Scanner;

public class infiniteLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for( ;;)
        {

            System.out.println("Enter your choice between 1 to 5 as below:");
            System.out.println("1 for aDD RECORD");
            System.out.println("2 for update RECORD");
            System.out.println("3 for display RECORD");
            System.out.println("4 for delete RECORD");
            System.out.println("5 FOR EXIT");

            int ch = scan.nextInt();

            if(ch==1)
            {
                System.out.println("Add Record");
            }else if(ch==2)
            {
                System.out.println("update Record");

            }else if(ch==3)
            {
                System.out.println("display Record");
            }
            else if(ch==4)
            {
                System.out.println("delete Record");
            }
            else if(ch==5)
            {
                System.exit(0);
            }



        }

    }
}
