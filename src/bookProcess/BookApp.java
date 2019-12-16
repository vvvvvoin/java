package bookProcess;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BookApp {

	public static void main(String[] args) {
		BookMgr bookMgr = new BookMgr();
		bookMgr.addBook(new Book("JAVA", 100));
		
		Scanner scanner = new Scanner(System.in);
		String msg = null;

		A: while (true) {
			System.out.println("원하는 번호를 입력하세요");
			System.out.println("1. 등     록");
			System.out.println("2. 수     정");
			System.out.println("3. 삭     제");
			System.out.println("4. 검     색");
			System.out.println("5. 목록보기");
			System.out.println("9. 종     료");

			msg = scanner.nextLine().trim();
			Scanner sc = new Scanner(System.in);
			Iterator<Book> it = bookMgr.bookList.iterator();
			
			switch (msg) {
			case "1":
				System.out.printf("%s 등 록 %n %n", msg);
				System.out.println("등록할 책의 제목을 입력하세요");
				String setTitle = scanner.nextLine().trim();
				System.out.println("등록할 책의 가격을 입력하세요");
				int setPrice = scanner.nextInt();
				scanner.nextLine();
				bookMgr.addBook(new Book(setTitle, setPrice));			
				break;
				
			case "2":
				System.out.printf("%s 수 정 %n", msg);
				System.out.println("수정할 도서 이름을 입력하세요");
				String modifyTitle = sc.nextLine().trim();
				it = bookMgr.bookList.iterator();
				while (it.hasNext()) {
					Book book = (Book) it.next();
					if (book.getTitle().toLowerCase().equals(modifyTitle.toLowerCase())){
						book.setTitle(book.getTitle() + "_수정됨");
					}
				}
				break;
			case "3":
				System.out.printf("%s 삭 제 %n", msg);
				System.out.println("삭제할 도서이름을 입력하세요.");
				String deleteTitle = sc.nextLine().trim();
				it = bookMgr.bookList.iterator();
				while (it.hasNext()) {
					Book book = (Book) it.next();
					if (book.getTitle().toLowerCase().equals(deleteTitle.toLowerCase())) {
						System.out.println(book);
						System.out.println("삭제할까요? Y을 입력하면 삭제됩니다");
						String yy = sc.nextLine().trim();
						if (yy.equalsIgnoreCase("y")) {
							it.remove();
						}
					}
				}
				break;
			case "4":
				System.out.printf("%s 검 색 %n", msg);
				String keyword = JOptionPane.showInputDialog("도서명의 키워드를 입력하하세요");
				System.out.println(keyword + "도서 검색결과");
				it = bookMgr.bookList.iterator();
				while (it.hasNext()) {
					Book book = (Book) it.next();
					if (keyword == null) break;
					if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
						System.out.println(book.getTitle());
					}
				}
				break;
			case "5":
				System.out.printf("%s 목록보기 %n", msg);
				System.out.println(bookMgr);
				break;
			case "9":
				System.out.printf("%s 입력 %n", msg);
				System.out.println("정말로 종료를 원하면 yes를 입력하세요");
				msg = scanner.nextLine();

				if (msg.equalsIgnoreCase("yes")) {
					if (scanner != null) {
						scanner.close();
						scanner = null;
					}
					System.out.println("종료합니다");
					break A;
				}
				else break;
			default:
				System.out.printf("정확한 번호를 입력해주세요 %n");
			}

		}

	}

}
