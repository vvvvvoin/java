package bookapp;

public class BookMgr {
	Book[] bookList = null;
	int cnt = 0;

	public BookMgr() {
		bookList = new Book[10];
	}

	public BookMgr(int size) {
		bookList = new Book[size];
	}

	public void addBook(Book book) {
		if(cnt == bookList.length) {
			Book[] temp = new Book[bookList.length * 2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			bookList = temp;
			temp = null;
		}
		bookList[cnt] = book;
		cnt++;
	}

	public void printBookList() {
		System.out.println("========== book list ==========");
		for (int i = 0; i < cnt; i++) {
			bookList[i].print();
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.println("총합계 : " + sum);
	}

	public void printSearchTitle(String title) {
		System.out.println("========== 검색 결과 ==========");
		for (int i = 0; i < cnt; i++) {
			if(bookList[i].getTitle().toLowerCase().contains(title.toLowerCase()))
			bookList[i].print();
		}
				
	}

}












