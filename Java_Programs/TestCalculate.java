//main inside another class
class Calculate {

static int cube(int n) {


		return n*n*n;

	}
}
class TestCalculate {

	public static void main(String[] arg) {

				//Calculate c1=new Calculate();// or

                int result =Calculate.cube(2);// provide class name and then static method name

				System.out.println("cube = " + result);

	}

	}
