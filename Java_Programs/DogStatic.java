    //If there is any private, final or static method in a class, there is static binding.
    // static binding
    class DogStatic{  
     private void eat(){System.out.println("dog is eating...");}  // private method ie. static binding
      
     public static void main(String args[]){  
      DogStatic d1=new DogStatic();  
      d1.eat();  
     }  
    }  
