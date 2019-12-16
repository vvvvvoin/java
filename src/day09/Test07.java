package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import bookapp.Book;

public class Test07 {

	public static void main(String[] args) {
		System.out.println("------------------Start------------------");
		Scanner scanner = null;

		try {
			scanner = new Scanner(new File("bookdata.txt"));
			while(scanner.hasNext()) {
				String[] data = scanner.nextLine().split(" ");
				Book book = new Book(data[0], Integer.parseInt(data[1]));
				System.out.println(book);
				
			}

		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일 확인해주세요");

		} finally {
			if (scanner != null) {
				scanner.close();
				scanner = null;
			}
		}

		System.out.println("------------------E n d------------------");
	}

}