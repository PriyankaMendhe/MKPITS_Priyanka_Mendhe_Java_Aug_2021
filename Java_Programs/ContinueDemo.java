class ContinueDemo {
    public static void main(String[] args)
    {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();//max. the lenth of string
        int numPs = 0;//no. of p's in string

        for (int i = 0; i < max; i++)
 {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
            {

				Continue;

		    }
            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}