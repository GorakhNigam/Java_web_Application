package Assignment;

public class Book {
	private int bookId;
	private String title;	
	private int edition;  
	private String author; 	
	private String publisher; 
	private int publishedYear;	
	private String description; 
	private int quantity;   
	private int cost;
	public Book(int bookId, String title, int edition, String author, String publisher, int publishedYear,
			String description, int quantity, int cost) {
		this.bookId = bookId;
		this.title = title;
		this.edition = edition;
		this.author = author;
		this.publisher = publisher;
		publishedYear = publishedYear;
		this.description = description;
		this.quantity = quantity;
		this.cost = cost;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		publishedYear = publishedYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
