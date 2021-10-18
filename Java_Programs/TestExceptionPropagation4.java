//IOException; must be caught or declared to be thrown

class TestExceptionPropagation4{
      void m(){
		  try
		  {
        throw new java.io.IOException("device error");//checked exception
	}catch(Exception ee)
	{
		System.out.println(ee);
	}
      }
      void n(){
        m();
      }
      void p(){
       try{
        n();
       }catch(Exception e){System.out.println("exception handeled");}
      }
      public static void main(String args[]){
       TestExceptionPropagation4 obj=new TestExceptionPropagation4();
       obj.p();
       System.out.println("normal flow");
      }
    }
