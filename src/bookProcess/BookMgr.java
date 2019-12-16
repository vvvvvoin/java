package bookProcess;

import java.util.ArrayList;
import java.util.List;

public class BookMgr {
	List<bookProcess.Book> bookList = new ArrayList<bookProcess.Book>();
	

	public List<bookProcess.Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<bookProcess.Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "BookMgr [bookList=" + bookList + "]";
	}

	public BookMgr() {
		super();
	}

	public BookMgr(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public void addBook(Book book) {
		bookList.add(book);
		
	}

	public void printBookList() {
	
	}

	public void printTotalPrice() {
		
	}

	public void printSearchTitle(String title) {
						
	}


	

}












