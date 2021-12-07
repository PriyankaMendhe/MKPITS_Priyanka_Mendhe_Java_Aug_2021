    import java.util.Map;  
    import java.util.HashMap;  
    import java.util.IdentityHashMap;  
    import java.util.*;  
    public class IdentityHashMapDemo {  
       public static void main(String args[]) {  
          // Creating the instance of IdentityHashmap   
          Map<String, String> ihm = new IdentityHashMap<>();  
          // Putting the elements in the map  
          // as key value pairs  
          ihm.put("Priya", "10100");  
          ihm.put("Shravan", "23290");  
          ihm.put(new String("Shreya"), "23330");  
          ihm.put("Anu", "45000");  
          ihm.put("Nirnay", "67700");  
          // Declaring a set of the entries  
          Set set = ihm.entrySet();  
          // Declaring an iterator  
          Iterator i = set.iterator();  
          // Displaying the elements  
          while(i.hasNext()) {  
             Map.Entry me = (Map.Entry)i.next();  
             System.out.print(me.getKey() + ": ");  
             System.out.println(me.getValue());  
          }  
          System.out.println();  
          // ihm.size() compares the objects by reference   
          // and prints size of IdentityHashMap  
          System.out.println("Size of IdentityHashMap is: " + ihm.size());  
       }  
    }  


