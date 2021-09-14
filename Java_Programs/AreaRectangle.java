//Calculate Area

class Rectangle
{
   int length=0;
   int width=0;
   int area=0;

   void insert(int l , int w)
   {
       length=l;
       width=w;
   }
   void calculateArea()
   {
      area = length * width ;
   }
   void displayArea()
   {
        System.out.println("Area = "+area);

   }
 }

 class AreaRectangle
 {

    public static void main(String arv[])
    {
     Rectangle r1 = new Rectangle(), r2 = new Rectangle();
     r1.insert(5,15);
     r1.calculateArea();
     r1.displayArea();
     r2.insert(5,10);
	 r2.calculateArea();
     r2.displayArea();
    }

 }


