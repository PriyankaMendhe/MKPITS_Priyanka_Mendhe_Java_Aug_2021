
//Exception handling program
class sample5 {
	public static void main(String[] arg) {
		int arr[] =new int[5];
		        int res=0;
		        try {
			String s="abc";
    int i=Integer.parseInt(s);//NumberFormatException

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