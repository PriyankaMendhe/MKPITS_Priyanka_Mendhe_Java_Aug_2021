// using diffrent reference variable name no need to use this keyword

class Book1{

String bookName;
int bookPrice;
String bookAuthor;

Book1(String bName, int bPrice, String bAuthor){

bookName=bName;
bookPrice=bPrice;
bookAuthor= bAuthor;
}

void display(){ System.out.println(bookName+ " "+bookPrice+" "+bookAuthor);}

}
class BookInput1{

public static void main(String abch[])
{
   Book1 b1 = new Book1("Oracle", 850 ,"vcbshj");
   Book1 b2 = new Book1("Java", 452, "ddded");

   b1.display();
   b2.display();
}
}