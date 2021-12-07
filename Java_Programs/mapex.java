//create a hashmap collection to store year and album name
import java.util.*;
class mapex {
public static void main(String[] arg) {
	NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
	map.put(2015,"silsilay");
	map.put(2000,"aaina");
	map.put(2005,"marasim");

	          //Maintains descending order
	          System.out.println("descendingMap: "+map.descendingMap());

               //Returns key-value pairs whose keys are less than or equal to the specified key.
		System.out.println("headMap: "+map.headMap(2005,true));
		
		//Returns key-value pairs whose keys are greater than or equal to the specified key.
                  System.out.println("tailMap: "+map.tailMap(2005,true));
						         
	//Returns key-value pairs exists in between the specified key.
       System.out.println("subMap: "+map.subMap(2000, false, 2015, true));








}

}
