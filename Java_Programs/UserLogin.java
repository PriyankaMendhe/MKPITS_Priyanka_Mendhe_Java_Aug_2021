//create a class User having fields username and pasword and
//setter and getter methods and checklogin and signup methods .

 class User{

 //private data members

 private String username;
 private String password;

 //public setter and getter method

 public void setUsername(String username)
 {
    this.username = username;
 }

 public String getUsername()
 {
   return username;
 }

 public void setPassword(String password)
 {
    this.password = password;
 }

 public String getPassword()
 {
   return password;
 }

 //create method for signup

 public void signUp(String username,String password)
 {

	 setUsername(username);
     setPassword(password);
     System.out.println("Login Credential Successfully Saved..!");

 }

 // create mwthod to check credential

 public String checkLogin(String username, String password)
 {

     if((username.equals("admin"))&&(password.equals("admin")))
     {

      return "login successful for user "+username;
     }
      else
      {
       return"invalid credentials, please try again..!";

      }
 }

 }

 public class UserLogin{

 public static void main(String args[]){

    User u = new User();
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("for Signup please enter below detail");
    System.out.println("enter username");
    String un = scan.next();

    System.out.println("enter password");
    String pwd = scan.next();

    u.signUp(un, pwd );

    System.out.println("---------------------------------------------");
    System.out.println("for sign in(Log in) enter below detail");
    System.out.println("enter username");
	  un = scan.next();
	System.out.println("enter password");
     pwd = scan.next();


    String result = u.checkLogin(u.getUsername(),u.getPassword());

    System.out.println(result);
 }

}