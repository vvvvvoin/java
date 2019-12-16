package app;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String msg = null;

		A: while (true) {
			System.out.println("원하는 번호를 입력하세요");
			System.out.println("1. 입     력");
			System.out.println("2. 수     정");
			System.out.println("3. 삭     제");
			System.out.println("4. 검     색");
			System.out.println("5. 목록보기");
			System.out.println("9. 종     료");

			msg = scanner.nextLine().trim();

			switch (msg) {
			case "1":
				System.out.printf("%s 입력 %n", msg);
				break;
			case "2":
				System.out.printf("%s 입력 %n", msg);
				break;
			case "3":
				System.out.printf("%s 입력 %n", msg);
				break;
			case "4":
				System.out.printf("%s 입력 %n", msg);
				break;
			case "5":
				System.out.printf("%s 입력 %n", msg);
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
