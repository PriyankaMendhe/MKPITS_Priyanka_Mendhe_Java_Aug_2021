//create a readonly class Book  having getter methods

class Book{

	private int id= 123;
	private String title =  "JAVA";
	private String author = "Martin";

	//getter method (Read only)
	public int getID(){ return id ;}
	public String getTitle(){ return title ;}
	public String getAuthor(){ return author ;}

}

class BookEnc{
	public static void main(String argc[]){

		Book b = new Book();
		System.out.println("Id is "+b.getID());
		System.out.println("Title is "+b.getTitle());
		System.out.println("Author is "+b.getAuthor());

	}}

