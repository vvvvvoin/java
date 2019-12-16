package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
		Set<Book> bookList = new HashSet<Book>();

		// 등록
		if(bookList.add(new Book("JAVA", 7500))) {
			System.out.println("등록완료");
		}else System.out.println("등록실패, 중복된 데이터가 있습니다.");
		bookList.add(new Book("SQL", 5500));
		bookList.add(new Book("JSP", 5000));
		if(bookList.add(new Book("JAVA", 7500))) {
			System.out.println("등록완료");
		}else System.out.println("등록실패, 중복된 데이터가 있습니다.");
		bookList.add(new Book("C++", 2400));
		bookList.add(new Book("C#", 9800));
		bookList.add(new Book("python", 10000));
		bookList.add(new Book("Matlab", 5000));
		bookList.add(new Book("R", 7850));
		bookList.add(new Book("ETC", 9900));

		// 출력 //내부적으로 equal이 발생하므로 override해야함
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}

		// 검색
		String keyword = JOptionPane.showInputDialog("도서명의 키워드를 입력하하세요");
		System.out.println(keyword + "도서 검색결과");
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (keyword == null) break;
			if (book.titile.toLowerCase().contains(keyword.toLowerCase())) {
				System.out.println(book);
			}
		}

		// 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 도서이름을 입력하세요.");
		String msg = sc.nextLine().trim();
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.titile.toLowerCase().contains(msg.toLowerCase())) {
				System.out.println(book);
				System.out.println("삭제할까요? Y을 입력하면 삭제됩니다");
				String yy = sc.nextLine().trim();
				if (yy.equalsIgnoreCase("y")) {
					it.remove();
				}
			}
		}

		System.out.println("수정할 도서 이름을 입력하세요");
		msg = sc.nextLine().trim();
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.titile.toLowerCase().contains(msg.toLowerCase())) {
				book.titile = book.titile + "___";
			}
		}

		sc.close();
		sc = null;
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
	}

}

class Book {
	String titile;
	int price;

	public Book(String titile, int price) {
		super();
		this.titile = titile;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [titile=" + titile + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((titile == null) ? 0 : titile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (titile == null) {
			if (other.titile != null)
				return false;
		} else if (!titile.equals(other.titile))
			return false;
		return true;
	}

}