class Book{

String bookName;
int bookPrice;
String bookAuthor;

Book(String bookName, int bookPrice, String bookAuthor){

this.bookName=bookName;
this.bookPrice=bookPrice;
this.bookAuthor= bookAuthor;

//this.display(); // or //

display(); // both perfoem same

}

void display(){ System.out.println(bookName+ " "+bookPrice+" "+bookAuthor);}

}
class BookInputTest{

public static void main(String abch[])
{
   Book b1 = new Book("Oracle", 850 ,"vcbshj");
   Book b2 = new Book("Java", 452, "ddded");


}
}