//create a class Book having private fields title
//and author and methods(setter and getter methods) setTitle(),setAuthor and getTitle() and getAuthor();

class Book{

private String title;
private String author;

//Creating setter and getter method

public void setTitle(String title)
{
   this.title = title;
}
public  String getTitle()
{
   return title;
}

 public void setAuthor(String author)
 {
    this.author = author;
 }
 public  String getAuthor()
 {
    return author;
 }

}
class BookE{

public static void main(String args[]){

Book b1 = new Book();

b1.setTitle("JAVA");
System.out.println("Title of Book is "+ b1.getTitle());
b1.setAuthor("MARTIN");
System.out.println("Author of Book is "+ b1.getAuthor());

}
}