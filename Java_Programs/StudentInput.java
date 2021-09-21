// without this keyword...check output

import java.util.*;
class StudentData{

   int rNo;
   String name;
   float fees;

   StudentData(int rNo, String Name, float fees)
   {
        rNo=rNo;
        name=name;
        fees=fees;
   }
   void display()
   {

     System.out.println(rNo+ " "+name+" "+fees);

   }
}

class StudentInput{

public static void main(String argc[]){

StudentData s1 = new StudentData(12,"Priyanka Mendhe", 89099f);
StudentData s2 = new StudentData(13,"Vaidehi Dahake" ,90058f);
s1.display();
s2.display();

}}