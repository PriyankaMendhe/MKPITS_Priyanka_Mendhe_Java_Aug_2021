//error: unreported exception IOException; must be caught or declared to be thrown

//error pgm

class TestExceptionPropagation22{
      void m(){
        throw new java.io.IOException("device error");//checked exception
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
       TestExceptionPropagation22 obj=new TestExceptionPropagation22();
       obj.p();
       System.out.println("normal flow");
      }
    }
