
class PalindromeType2
{

public static void main(String args[])
{
      String str="Madam";
      StringBuilder originalStr= new StringBuilder(str);
      System.out.println("Original String : "+originalStr);
      System.out.println("Original String : "+str);

      StringBuilder reverseStr=originalStr.reverse();
      System.out.println("Reverse String : "+reverseStr);

      String rStr=reverseStr.toString();

      if(str.equalsIgnoreCase(rStr))
      {
		  System.out.println("String is Palindrome");

	  }
	  else
	  {
		  System.out.println("String is not Palindrome");

	  }





}

}