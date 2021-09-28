class Bank{

int roi()
{
   return 0;
}
}
class SBI extends Bank
{
	int roi()
	{
	   return 8;
    }
}
class ICICI extends Bank
{
	int roi()
	{
	   return 6;
    }
}
class AXIS extends Bank
{
	 int roi()
	  {
	     return 9;
      }
}

class OverrideBank{

public static void main(String arv[]){

Bank b = new Bank();
int result =b.roi ();
System.out.println("ROI of Bank is "+result);

SBI s = new SBI();
result =s.roi ();
System.out.println("ROI of SBI Bank is "+result);

ICICI i = new ICICI();
result =i.roi ();
System.out.println("ROI of ICICI Bank is "+result);

AXIS a = new AXIS();
result =a.roi ();
System.out.println("ROI of AXIS Bank is "+result);




}
}