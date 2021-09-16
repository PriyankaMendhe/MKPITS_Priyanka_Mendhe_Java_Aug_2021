package bank;
//import sbi.*;// other option as fully qualified
class Customer2{

public static void main(String abc[]){

//fully qualified access method
sbi.Account act = new sbi.Account();
String str = act.deposit(100);
System.out.println(str);

}
}
