    //Java Program to copy a source array into a destination array in Java
    class TestArrayCopyDemo {
        public static void main(String[] args) {
            //declaring a source array
            char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                    'i', 'n', 'a', 't', 'e', 'd' };
            //declaring a destination array
            char[] copyTo = new char[7];

            //copying array using System.arraycopy() method
            System.arraycopy(copyFrom, 2, copyTo, 0, 7); // copyFrom, 2(from sourece array 2nd postion)
                                                          // copyTo, 0,7(copy to destination from o to 7th postion)

            //printing the destination array

            System.out.println(String.valueOf(copyTo));
        }
    }
