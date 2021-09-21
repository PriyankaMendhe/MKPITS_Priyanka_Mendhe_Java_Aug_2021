// using this keyword with same variable name

class Book{

String bookName;
int bookPrice;
String bookAuthor;

Book(String bookName, int bookPrice, String bookAuthor){

this.bookName=bookName;
this.bookPrice=bookPrice;
this.bookAuthor= bookAuthor;
}

void display(){ System.out.println(bookName+ " "+bookPrice+" "+bookAuthor);}

}
class BookInput{

public static void main(String abch[])
{
   Book b1 = new Book("Oracle", 850 ,"vcbshj");
   Book b2 = new Book("Java", 452, "ddded");

   b1.display();
   b2.display();
}
}