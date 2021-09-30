//java interface which provides the implementation of Bank interface


interface Bank
{

float rateOfIntrest();

}
class SBI implements Bank{

	public float rateOfIntrest(){return 9.15f;}
}
class PNB implements Bank{

	public float rateOfIntrest(){return 9.7f;}
}

class BankInterface{

public static void main(String args[]){

	Bank b = new SBI();

	System.out.println("Rate of Intrest of SBI : "+ b.rateOfIntrest());
}
}