//String[] split(String regex)
//returns a split string matching regex.
import java.util.*;
class StringSplit1{
public static void main(String args[])
{
	String fname="muyuri,ekta,swati";
	String[] arr=fname.split(",",2);// split string by "," or any like ". " "-"
for(String s : arr)
	System.out.println(s);


//" " Space

String fname2="muyuri ekta swati";
	String[] arr1=fname2.split(" ",3);// split string by "," or any like ". " "-"
for(String s1 : arr1)
	System.out.println(s1);

     }
    }
