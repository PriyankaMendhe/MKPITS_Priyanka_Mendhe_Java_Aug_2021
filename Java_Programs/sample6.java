//Exception handling program

class sample6 {
	public static void main(String[] arg) {
		int arr[] =new int[5];
		        int res=0;
		        try {
			int num[]=new int[3];
    num[4]=33;

		        }catch (Exception ee) {
		            System.out.println(ee.toString());

		        }
		        finally {
		            System.out.println("finally executed");
		        }
		        System.out.println("bye");

		System.out.println("program reached successfully till end");
		}

}

