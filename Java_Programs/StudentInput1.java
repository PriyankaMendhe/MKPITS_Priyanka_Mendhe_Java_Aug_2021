//  this keyword...check output

import java.util.*;
class StudentData1{

   int rNo;
   String name;
   float fees;

   StudentData1(int rNo, String name, float fees)// if we use same variable ie local variable and instance variable name..
   {
   //using this keyword to distinguish local variable and instance variable.
       this.rNo=rNo;
        this.name=name;
        this.fees=fees;
   }
   void display()
   {

     System.out.println(rNo+ " "+name+" "+fees);

   }
}

class StudentInput1{

public static void main(String argc[]){

StudentData1 s1 = new StudentData1(12,"Priyanka Mendhe", 89099f);
StudentData1 s2 = new StudentData1(13,"Vaidehi Dahake" ,90058f);
s1.display();
s2.display();

}}