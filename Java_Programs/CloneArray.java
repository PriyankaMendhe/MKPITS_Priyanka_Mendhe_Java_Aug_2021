class CloneArray{

public static void main(String agc[]){

int Oarray[]={1,2,3,4,5};

System.out.println("Original Array");

for(int i : Oarray)
{
   System.out.println(i);
}

int cloneArray[] = Oarray.clone();

System.out.println("clone Array");

for(int i : cloneArray)
{
   System.out.println(i);
}


System.out.println("IS both array is equal???");

System.out.println(Oarray==cloneArray);

}


}