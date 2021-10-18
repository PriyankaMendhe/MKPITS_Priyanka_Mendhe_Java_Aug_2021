
//subclass overridden method can declare same, subclass exception

import java.io.*;
class account {
	void deposit(int amt) throws IOException {
		System.out.println("deposit method of account class");
	}
}
class saving extends account {
	void deposit(int amt) throws IOException  {
		System.out.println("deposit method of saving class");
	}
}

public class throwsex5 {
        public static void main(String[] args)  {
			try {
saving s=new saving();
s.deposit(100);
}
catch(Exception ee ) { }

    }
}
