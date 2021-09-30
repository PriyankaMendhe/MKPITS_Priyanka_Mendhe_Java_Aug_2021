//Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
//with separate methods for each operation whose real and imaginary parts are entered by user.

public class ComplexNumber{

// for real and imaginary part of complex numbers

double real, img;

//constructor to initialize the complex number

ComplexNumber(double real , double img)
{
	this.real = real;
	this.img = img;
}
// sum is a type of ComplexNumber
public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
{
	// creating temporary complex number to hold sum of two numbers

	ComplexNumber temp = new ComplexNumber(0,0);
	temp.real = c1.real + c2. real ;
	temp.img = c1.img + c2. img ;
	// return output Complex Number
	return temp;
}

public static void main(String argc[])
{
	ComplexNumber c1 = new ComplexNumber(5.5 , 1);
	ComplexNumber c2 = new ComplexNumber(5.0 , 2.5 );

	ComplexNumber temp = sum(c1 , c2);
	System.out.println("Sum is : "+temp.real+ "+" +temp.img+ "i");
}


}

