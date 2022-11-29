

public class Book {

	int id;
	String title;
	String author;
	/*String publisher;
	String language;
	String type;
	String noOfpages; */
	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public void printBookInfo() {
		System.out.println("Book id = " + id);
		System.out.println("Book name = " + title);
		System.out.println("Book id = " + author);
	}
}
