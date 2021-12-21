
//not effective for upper case and lower case

 class PalindromeType1 {


 	public static void main(String args[])
 	{

 		String str="Madam";

 		String str1 = str.toLowerCase();
 		int i=0,j=str1.length()-1;

 		int flag=0;

 		while(i<j)
 		{
 			if (str1.charAt(i) != str1.charAt(j))
 			{

 				flag=1;
 				break;
 			}
 			i++;
 			j--;

 		}

 		if(flag==1)
 		{

 			System.out.println("String is not palindrome:   "+str1);

 		}
 		else
 		{
 			System.out.println("String is palindrome:   "+str1);


 		}


 	}
}