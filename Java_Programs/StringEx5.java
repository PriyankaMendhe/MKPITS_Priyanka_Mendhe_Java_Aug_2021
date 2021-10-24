class StringEx5
 {

   public static void main(String argc[])
   {

      String cName= new String("MKPITS Solution");// direct assign with new kryword

      System.out.println("Company Name  "+cName);

  for(int i=0;i<15;i++)
  {
      char ch = cName.charAt(i);// to get charcter at particular position/index

      System.out.println("Character at position "+i+ " is: "+ch);
  }

   }




}