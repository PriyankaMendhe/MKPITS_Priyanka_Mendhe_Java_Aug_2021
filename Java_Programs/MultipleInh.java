interface Printable{  
    void print();  
    }  
    interface Showable{  
    void show();  
    }  
    class MultipleInh implements Printable,Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
   MultipleInh obj = new MultipleInh();  
    obj.print();  
    obj.show();  
     }  
    }  
