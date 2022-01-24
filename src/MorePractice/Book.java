package MorePractice;

public class Book {
	
	private static int count;
	private int bookId;
	private String author;
	private String title;
	private String genre;
	private double price;
	
	public Book(String author, String title, String genre, double price) {
		
		count++;
		bookId = count;
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.price = price;
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", author=" + author + ", title=" + title + ", genre=" + genre + ", price="
				+ price + "]";
	}

}
