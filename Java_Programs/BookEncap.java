// write only

class Book{

private String title, author;

public void setTitle(String title){  this.title = title; }

public void setAuthor(String author){ this.author = author;}

void display()
{

System.out.println(title+ " "+author);
}

}
class BookEncap
{
  public static void main(String argc[]){

  Book b = new Book();
  b.setTitle("Java");
  b.setAuthor("Martin");
  b.display();
}
}