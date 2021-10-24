class StringEx6
 {

   public static void main(String argc[])
   {

      String cName= new String("MKPITS Solution");// direct assign with new kryword

      System.out.println("Company Name  "+cName);

  for(int i=0;i<cName.length();i++)//by length String
  {
      char ch = cName.charAt(i);// to get charcter at particular position/index

      System.out.print(" "+ch);
  }

   }




}