class CounterS{

	//As we have mentioned above, static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.

    static int  count=0;//will get memory on class loading time which is shared memory

    CounterS(){

    count++;//incrementing value
    System.out.println(count);

    }

    public static void main(String args[]){
    //Creating objects
    CounterS c1=new CounterS();
    CounterS c2=new CounterS();
    CounterS c3=new CounterS();
    }
    }