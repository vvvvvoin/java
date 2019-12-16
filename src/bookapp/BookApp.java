package bookapp;

import javax.swing.JOptionPane;

public class BookApp {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(3);

		Book book = new Book("Java Program", 3000);
		mgr.addBook(book);

		mgr.addBook(new Book("SQL", 8500));
		mgr.addBook(new Book("HTML", 20000));
		mgr.addBook(new Book("EJB", 1000));

		mgr.printBookList();

		mgr.printTotalPrice();

		String title = JOptionPane.showInputDialog("검색할 책 제목을 입력하세요");
		mgr.printSearchTitle(title);
		

	}

}
