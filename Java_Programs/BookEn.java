//write the logic inside the setter method.
//logic not to store the negative numbers in the setter methods.

class Book{

private String title;
private String author;
private int id;

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

 public void setID(int id){
	if(id >= 0) {

	 this.id = id;
	 }else
	 {
		System.out.println("ID can not be negative");

	}
}

public int getID()
{
	return id;
}



}
class BookEn{

public static void main(String args[]){

Book b1 = new Book();

b1.setTitle("JAVA");
System.out.println("Title of Book is "+ b1.getTitle());
b1.setAuthor("MARTIN");
System.out.println("Author of Book is "+ b1.getAuthor());
b1.setID(1213);
System.out.println("ID is  : "+ b1.getID());


}
}