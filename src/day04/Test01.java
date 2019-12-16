package day04;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) throws Exception {
		System.out.println("App 시작 . . .");
		int kor = 0, eng = 0, math = 0;
		String name = null;

		Scanner scanner = new Scanner(new FileInputStream("c://lib/score.txt"), "UTF-8");
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine();

		double sum = (kor + eng + math);
		double avg = sum / 3.;

		System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d %n", name, kor, eng, math);
		System.out.printf("평균: %.2f %n", avg);
		
		char grade = 'F';
		switch((int)avg/10) {
		case 10:
		case 9:
			grade= 'A';
			break;
		case 8:
			grade= 'B';
			break;
		case 7:
			grade= 'C';
			break;
		case 6:
			grade= 'D';
			break;
		default:
			grade = 'F';
			
		
		}
		
		System.out.printf("학점: %c 학점 %n", grade);
		if (scanner != null) scanner.close();
		scanner = null;

		switch(grade) {
		case 'A':
			System.out.printf("참 잘했어요");
			break;
		case 'B':
			System.out.printf("잘했어요");
			break;
		case 'C':
			System.out.printf("좀 더 잘해보아요");
			break;
		case 'D':
			System.out.printf("노력하세요");
			break;
		default:
			System.out.printf("재수강하세욧");			
		}
		
		return;

	}

}
