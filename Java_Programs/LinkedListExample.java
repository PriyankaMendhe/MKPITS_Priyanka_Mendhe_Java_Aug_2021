import java.util.*;
import java.io.*;
class Book {
    int id;
    String name;
    int quantity;
    public Book(int id, String name,  int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    }
    public class LinkedListExample {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        //Creating list of Books
        List<Book> list=new LinkedList<Book>();
        Book[] b=new Book[3];
        for(int i=0;i<3;i++) {
			System.out.println("enter book id ");
			int id=scan.nextInt();
			System.out.println("enter book name ");
			String name=scan.next();
			System.out.println("enter book quantity ");
			int quantity=scan.nextInt();
			b[i]=new Book(id,name,quantity);
			list.add(b[i]);
		}


 //Traversing list
        for(Book b1:list){
        System.out.println(b1.id+" "+b1.name+" "+b1.quantity);
        }


    }
    }
