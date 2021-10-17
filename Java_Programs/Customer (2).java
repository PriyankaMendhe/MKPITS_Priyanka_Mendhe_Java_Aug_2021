import java.io.Serializable;

public class Customer implements Serializable{

	String name;
	String email;

	Customer(String name,String email)
	{
	   this.name = name;
	   this.email = email;
	}
}

