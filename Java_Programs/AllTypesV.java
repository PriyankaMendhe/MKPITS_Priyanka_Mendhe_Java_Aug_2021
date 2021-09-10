    public class AllTypesV
    {
        static int m=100;//static variable

        public static void main(String args[])
        {
            int data=50;//instance variable
            int n=12;

            System.out.println(" m = "+ m);
            System.out.println(" data = "+ data);
            method();
            System.out.println(" n = "+ n);
        }


        static void method()// must add static bcoz calling from static class else show error
		        {
		            int n=90;//local variable
		            System.out.println(" n = "+ n);
        }
    }//end of class

//both n shows different value
