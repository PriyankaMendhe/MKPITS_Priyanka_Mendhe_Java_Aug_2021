
    //Java Program to illustrate how to declare, instantiate, initialize
    //and traverse the Java array.

    class TestArray1
    {

        public static void main(String argc[])
        {

           int[] arr =new int[5];//declaration and Instantiation

           arr [0]=1;
           arr [1]=4;
           arr [2]=14;
           arr [3]=19;
           arr [4]=10;

           //traversing or display array

           for (int i=0 ; i<arr.length ; i++)
           {
              System.out.println(arr[i]);

           }


        }


    }
