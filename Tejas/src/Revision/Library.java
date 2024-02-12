package Revision;

import java.util.LinkedList;

public class Library {
	
	public LinkedList<Book> booklist = new LinkedList<Book>();
	
	public void addBook(Book b) {
		booklist.add(b);
	}
	
	public boolean removeBook() {
		booklist.remove(b);	
	}
	
	public void displayBook() {
		for (Book b : booklist) {
			System.out.println(b);
		}
	}

}
