package business;

public class BookCopy {

	private Book book;
	private int numOfCopies;

	public BookCopy(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public Book getBook() {
		return book;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

}
