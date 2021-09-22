// A Account class which is a fully encapsulated class.

class Account{
private long accNo;
private String name, email;
private float amount;

// setter method for all private data member
public void setAccNo(long accNo) { this.accNo=accNo; }
public void setName(String name) { this.name=name; }
public void setEmail(String email ) { this.email=email; }
public void setAmount(int amount) { this.amount=amount; }

//getter method for all private member

public long getAccNo() {return accNo; }
public String getName() {return name; }
public String getEmail() {return email; }
public float getAmount() {return amount; }


}

class AccountE{

public static void main(String argc[]){

	Account a = new Account();
	a.setAccNo(8757810117852641L);
	a.setName("Priyanka Mendhe");
	a.setEmail("priyankamd12@GMail.com");
	a.setAmount(501201);

	//display values through getter method.
	System.out.println(a.getAccNo()+ " "+a.getName()+" "+a.getEmail()+" "+a.getAmount());


}
}