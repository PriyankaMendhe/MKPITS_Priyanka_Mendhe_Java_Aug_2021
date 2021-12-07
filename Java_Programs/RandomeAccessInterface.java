// Java code to demonstrate addObserver() method
import java.util.*;

class RandomeAccessInterface {
    // Driver method of the program
    public static void main(String args[])
    {
       ArrayList<String> list=new ArrayList<String> ();
       list.add("apple");
       list.add("mango");
       list.add("banana");
            for (int i=0, n=list.size(); i < n; i++)
	          System.out.println(  list.get(i));


	  // runs faster than this loop:
//In the context of the RandomAccess interface, the first loop using List.get( ) should be //faster than  other loops that use Iterator.next( ) for a list to implement RandomAccess.

	        for (Iterator i=list.iterator(); i.hasNext(); )
	           System.out.println( i.next());

    }
}

