//String BUffer
class PalindromeType4
{

public static void main(String args[])
{
      String str="Madam";
      StringBuffer originalStr= new StringBuffer(str);
      System.out.println("Original String : "+originalStr);
      //System.out.println("Original String : "+str);Madam

      StringBuffer reverseStr=originalStr.reverse();
      System.out.println("Reverse String : "+reverseStr);

      //String rStr=reverseStr.toString();

      if(str.contentEquals(reverseStr))
      {
		  System.out.println("String is Palindrome");

	  }
	  else
	  {
		  System.out.println("String is not Palindrome");

	  }


}

}