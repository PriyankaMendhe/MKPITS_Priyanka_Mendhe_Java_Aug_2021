import java.util.*;

class Treesetex1
{
	public static void main(String[] arg)
	{
		  TreeSet<String> set=new TreeSet<String>();
		               set.add("mi10");
		               set.add("sony");
		               set.add("vivo");
		               set.add("realme");
		               set.add("motorola");
		               System.out.println("Initial Set: "+set);

		               System.out.println("Reverse Set: "+set.descendingSet());

					                System.out.println("Head Set: "+set.headSet("realme", true));
					             System.out.println("SubSet: "+set.subSet("mi10", false, "realme", true));

             System.out.println("TailSet: "+set.tailSet("mi10", true));





		     }
		    }
