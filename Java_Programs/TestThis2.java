   class Book{

   String bookName;
   int bookPrice;
   String bookAuthor;

   Book(){System.out.println("Empty constructor called with this keyword");}



   Book(String bookName, int bookPrice, String bookAuthor){

   this();

   this.bookName=bookName;
   this.bookPrice=bookPrice;
   this.bookAuthor= bookAuthor;

   //this.display(); // or //

   display(); // both perfoem same

   }

   void display(){ System.out.println(bookName+ " "+bookPrice+" "+bookAuthor);}

   }
   class TestThis2{

   public static void main(String abch[])
   {
      Book b1 = new Book("Oracle", 850 ,"vcbshj");


   }
}