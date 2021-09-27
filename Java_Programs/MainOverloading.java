


class MainOverloading{

	public static void main(String abc[]){

		System.out.println("main with String[]");
		main("abc");// calling main with string
		main();//calling main without string

		}
	public static void main(String abc){ System.out.println("main with String");}
	public static void main(){ System.out.println("main without String");}


}
