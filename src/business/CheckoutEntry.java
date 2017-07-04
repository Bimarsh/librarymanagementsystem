package business;

import java.time.LocalDate;

public class CheckoutEntry {
	
	private Book book;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	public CheckoutEntry(LocalDate checkoutDate, LocalDate dueDate) {
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

}
