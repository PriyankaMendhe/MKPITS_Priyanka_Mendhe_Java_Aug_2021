public class ArmStrong {

    public static void main(String[] args) {


        int c=0, a, temp,sum=0;

        int num=153;

        temp=num;

        while(num>0)
        {
            a=num%10;

            c = a*a*a;

            sum = sum+c;

            num=num/10;

        }

        if(sum==temp)
        {

            System.out.println("no. is armstrong");
        }
        else
        {
            System.out.println("no.is not armstrong");
        }
    }
}
