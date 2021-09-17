//example without static method 


class Calculate1 {

	static int cube(int n) {
		
		return n*n*n;

	}
	
	
	public static void main(String[] arg) {
		Calculate1 c1=new Calculate1();
		int result =c1.cube(2);
		System.out.println("cube = " + result);

	}

}