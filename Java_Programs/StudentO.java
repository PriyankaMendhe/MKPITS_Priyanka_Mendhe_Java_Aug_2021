//Java program to overload constructors
    class StudentO{
        int id;
        String name;
        int age;
        //creating two arg constructor
        StudentO(int i,String n){
        id = i;
        name = n;
        }
        //creating three arg constructor
        StudentO(int i,String n,int a){
        id = i;
        name = n;
        age=a;
        }
        void display(){System.out.println(id+" "+name+" "+age);}

        public static void main(String args[]){
        StudentO s1 = new StudentO(111,"Karan");
        StudentO s2 = new StudentO(222,"Aryan",25);
        s1.display();
        s2.display();
       }
    }
