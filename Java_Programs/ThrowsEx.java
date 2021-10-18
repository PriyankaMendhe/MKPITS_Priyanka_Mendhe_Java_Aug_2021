class saving {
		String deposit(int amt) throws Exception
		{
			return "amount deposited";
		}
	    }

public class ThrowsEx {
        public static void main(String[] args)  {


        saving s=new saving();
       try
        {
            String str=s.deposit(100);
            System.out.println(str);
        }
       catch(Exception ee) {

	System.out.println(ee.toString());
         }


    }
}
