// Complie time error program for Overriden method
//error


class account {
	void deposit(int amt) {
		System.out.println("deposit method of account class");
	}
}
class saving extends account {
	void deposit(int amt) throws IOException {
		System.out.println("deposit method of saving class");
	}
}

public class ThrowsEx2{
        public static void main(String[] args)  {


    }
}
