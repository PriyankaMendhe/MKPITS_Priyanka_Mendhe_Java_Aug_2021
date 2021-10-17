
//Exception handling program
class sample4 {
	public static void main(String[] arg) {
		int arr[] =new int[5];
		        int res=0;
		        try {


					    String s=null;
					    System.out.println(s.length());//NullPointerException

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

