interface inter
{


  public void name();
  default void name1()
  {
  
  
  }


}

class impl implements inter
{

    public void name()
    {
    
      System.out.println("interface 1 method override");
    
    }

//no need to override default method of interface
}

class imp2 implements inter
{
    public void name()
       {
       
         System.out.println("interface 1 method override");
       
       }
//override default method of interface

public void name1()
{

     System.out.println("interface 1 default method override");

}


}

class flamb
{
     public static void main(String args[])
     {
         impl ob1 = new impl();
         
         ob1.name();
         
         imp2 ob2 = new imp2();
         ob2.name();
         ob2.name1();
     
     
     
     }



}