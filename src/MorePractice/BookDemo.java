package MorePractice;

import java.util.ArrayList;
import java.util.HashSet;

public class BookDemo {
	
	public static void main(String[] args) {
		
		Book[] books = new Book[7];
		
		books[0] = new Book("Stephen King", "Cujo", "Horror",5.99);
		books[1] = new Book("Bram Stoker", "Dracula", "Horror",8.99);
		books[2] = new Book("Jeanne DuPrau","City Of Ember", "Fantasy",5.99);
		books[3] = new Book("Jeanne DuPrau", "The People of Sparks",  "Fantasy",7.99);
		books[4] = new Book("Jeanne DuPrau", "The Prophet of Yonwood",  "Fantasy",6.99);
		books[5] = new Book("Jeanne DuPrau", "The Diamond of Darkhold",  "Fantasy",8.99);
		books[6] = new Book( "J.K. Rowling", "Harry Potter", "Fantasy",2.99);
		
		ArrayList <Book> booksList = new ArrayList<Book>();
		
		for(int i = 0; i < books.length; i++) {
			booksList.add(books[i]);
		}
		
		
		System.out.println("");
		System.out.println("getAllAuthorsForGenre(books, Fantasy):");
		HashSet <String> temp = getAllAuthorsForGenre(books, "Fantasy");
		for(String match: temp) {
			System.out.println(match);
		}
		
		System.out.println("");
		System.out.println("getAllAuthorsForGenre(booksList, Fantasy):");
		HashSet <String> temp1 = getAllAuthorsForGenre(booksList, "Fantasy");
		for(String match: temp1) {
			System.out.println(match);
		}
		
		System.out.println("");
		System.out.println("findBooksCheaperThan(books, 5):");
		Book[] temp2 = findBooksCheaperThan(books, 5);
		for(int i = 0; i < temp2.length; i++) {
			System.out.println(temp2[i].toString());
		}
		
		System.out.println("");
		System.out.println("findBooksCheaperThan(booksList, 5):");
		Book[] temp3 = findBooksCheaperThan(booksList, 5);
		for(int i = 0; i < temp3.length; i++) {
			System.out.println(temp3[i].toString());
		}
		
		
		System.out.println("");
		System.out.println("getAllBooksByAuthor(books, Jeanne DuPrau):");
		Book[] temp4 = getAllBooksByAuthor(books, "Jeanne DuPrau");
		for(int i = 0; i < temp4.length; i++) {
			System.out.println(temp4[i].toString());
		}
		System.out.println("");
		System.out.println("getAllBooksByAuthor(booksList, Jeanne DuPrau):");
		Book[] temp5 = getAllBooksByAuthor(booksList, "Jeanne DuPrau");
		for(int i = 0; i < temp5.length; i++) {
			System.out.println(temp5[i].toString());
		}
		
		System.out.println("");
		System.out.println("displayAllBooks(books):");
		displayAllBooks(books);
		
		System.out.println("");
		System.out.println("displayAllBooks(booksList):");
		displayAllBooks(booksList);
		
		System.out.println("");
		System.out.println("getAllBookTitlesThatMatch(books, of):");
		ArrayList<Book> temp6 = getAllBookTitlesThatMatch(books, "of");
		for(int i = 0; i < temp6.size(); i++) {
			System.out.println(temp6.get(i).toString());
		}
		System.out.println("");
		System.out.println("getAllBookTitlesThatMatch(booksList, of):");
		ArrayList<Book> temp7 = getAllBookTitlesThatMatch(booksList, "of");
		for(int i = 0; i < temp7.size(); i++) {
			System.out.println(temp7.get(i).toString());
		}
		
		
		
		
		
	}
	
	
	
	
	public static HashSet<String> getAllAuthorsForGenre(Book[] books, String genre){
		
		HashSet<String> matches = new HashSet<String>();
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getGenre().equalsIgnoreCase(genre)) {
				matches.add(books[i].getAuthor());
			}
		}
		
		return matches;
		
		
	}
	
	public static HashSet<String> getAllAuthorsForGenre(ArrayList<Book> books, String genre){
		
		HashSet<String> matches = new HashSet<String>();
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getGenre().equalsIgnoreCase(genre)) {
				matches.add(books.get(i).getAuthor());
			}
		}
		
		return matches;
		
	}
	
	public static Book[] findBooksCheaperThan(Book[] books, double price) {
		
		int count = 0;
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getPrice() < price) {
				count++;
			}
		}
		
		Book[] matches = new Book[count];
		int pos = 0;
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getPrice() < price) {
				matches[pos] = books[i];
				pos++;
			}
		}
		
		return matches;
		
		
	}
	
	public static Book[] findBooksCheaperThan(ArrayList<Book> books, double price) {
		
		int count = 0;
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getPrice() < price) {
				count++;
			}
		}
		
		Book[] matches = new Book[count];
		int pos = 0;
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getPrice() < price) {
				matches[pos] = books.get(i);
				pos++;
			}
		}
		
		return matches;
		
	}
	
	public static Book[] getAllBooksByAuthor(Book[] books, String author){
		
		int count = 0;
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getAuthor().equalsIgnoreCase(author)) {
				count++;
			}
		}
		
		Book[] matches = new Book[count];
		int pos = 0;
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getAuthor().equalsIgnoreCase(author)) {
				matches[pos] = books[i];
				pos++;
			}
		}
		
		return matches;
		
		
		
	}
	
	public static Book[] getAllBooksByAuthor (ArrayList<Book> books, String author){
		
		int count = 0;
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getAuthor().equalsIgnoreCase(author)) {
				count++;
			}
		}
		
		Book[] matches = new Book[count];
		int pos = 0;
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getAuthor().equalsIgnoreCase(author)) {
				matches[pos] = books.get(i);
				pos++;
			}
		}
		
		return matches;
		
	}
	
	public static void displayAllBooks(Book[] books) {
		
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].toString());
		}
		
	}
	
	public static void displayAllBooks(ArrayList<Book> books) {
		
		for(int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
		
	}
	
	public static ArrayList<Book> getAllBookTitlesThatMatch(Book[] books, String searchString){
		
		ArrayList<Book> matches = new ArrayList<Book>();
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getTitle().toLowerCase().contains(searchString)){
				matches.add(books[i]);
			}
		}
		
		return matches;
		
	}
	

	public static ArrayList<Book> getAllBookTitlesThatMatch(ArrayList<Book> books, String searchString){
		
		ArrayList<Book> matches = new ArrayList<Book>();
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().toLowerCase().contains(searchString)){
				matches.add(books.get(i));
			}
		}
		
		return matches;
		
	}
	
	

}
