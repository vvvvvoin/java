package day03;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("App 시작 . . .");
		int kor = 0, eng = 0, math = 0;
		String name = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("성적처리를 종료할려면 Quit를 입력하세요");
		String msg = scanner.nextLine();
		if (msg.toLowerCase().equals("quit".toLowerCase())) {
			if (scanner != null) {
				scanner.close();
				scanner = null;
			}
			System.out.println("App을 종료합니다...");
			return;
		}

		System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.");
		System.out.println("ex)홍길동 90 90 90");

		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine();

		double sum = (kor + eng + math);
		double avg = sum / 3.;

		System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d %n", name, kor, eng, math);
		System.out.printf("평균: %.2f %n", avg);

		if (avg > 80) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("합격입니다.");
		}

		scanner.close();
		scanner = null;

		return;

	}

}
