import java.io.*;
class cal1
{
	int divide(int n1,int n2) {
		int res=n1/n2;
		return res;
	}
}

class  cal2  extends cal1
{
	int caldivide(int n1,int n2)
	{
		int res=0;
		try
		{

		res=divide(n1,n2);
		return res;
	}catch(Exception ee) {
		System.out.println(ee.toString());
	}
	return res;

	}
}

public class throwsPropgation{
        public static void main(String[] args)  {
			cal2 c=new cal2();
			int r=c.caldivide(2,0);
			System.out.println(r);
			System.out.println("reached till the end");
}
}
