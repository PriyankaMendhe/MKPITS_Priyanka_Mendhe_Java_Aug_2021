//example without static method 


class Calculate {

	int cube(int n) {
		
		return n*n*n;

	}
	
	
	public static void main(String[] arg) {
		Calculate c1=new Calculate();
		int result =c1.cube(2);
		System.out.println("cube = " + result);

	}

}
