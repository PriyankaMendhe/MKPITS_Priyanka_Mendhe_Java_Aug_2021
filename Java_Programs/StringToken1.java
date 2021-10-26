//tokenizes a string "my name is mkpits" on the basis of whitespace.

    import java.util.StringTokenizer;
    public class StringToken1{
     public static void main(String args[]){
       StringTokenizer st = new StringTokenizer("Welcome.to.Mkpits.solution",".");
         while (st.hasMoreTokens()) {
             System.out.println(st.nextToken());
         }
       }
    }
