public class RemoveWhiteSpace {

    public static void main(String[] args) {

        String str1="Saket   Saurav        is Any lyst";

        //usomg replaceall method

       String str2=str1.replaceAll("\\s","");



        System.out.println(str2);
    }
}
