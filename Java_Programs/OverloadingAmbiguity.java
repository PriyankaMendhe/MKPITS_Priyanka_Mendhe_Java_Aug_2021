// it will give compile time error

class OverloadingAmbiguity{
      void sum(int a,long b){System.out.println("a method invoked");}
      void sum(long a,int b){System.out.println("b method invoked");}

      public static void main(String args[]){
     OverloadingAmbiguity obj=new OverloadingAmbiguity();
      obj.sum(20,20);//now ambiguity
      }
    }


