package business;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String title;
	private String ISBN;
	private boolean availability;
	private List<Author> authors;
	private List<BookCopy> copies;

	public Book(String title, String ISBN, boolean availability) {
		this.title = title;
		this.ISBN = ISBN;
		this.availability = availability;

		authors = new ArrayList<Author>();
		copies = new ArrayList<BookCopy>();
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public String getISBN() {
		return ISBN;
	}

	public boolean isAvailability() {
		return availability;
	}

	public List<BookCopy> getCopies() {
		return copies;
	}

}
