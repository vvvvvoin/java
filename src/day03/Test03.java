package day03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		String name = null;
		int kor = 0;
		int math = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력하세요_");
		name = scanner.nextLine();
		System.out.println(name.length());
		System.out.println("국어점수를 입력하세요_");
		kor = Integer.parseInt(scanner.nextLine());
		System.out.println("수학점수를 입력하세요_");
		math = scanner.nextInt();
		scanner.nextLine(); // nexInt의 엔터의 메모리값을 제거 (무한루프에서는 문제가되기에 삭제해야함)

		double avg = (kor + math) / 2.;
		System.out.printf("이름 :  %s 국어점수 : %d 수학점수 : %d 평균점수 : %f %n", name, kor, math, avg);
		System.out.println(avg >= 85 ? "합격" : "불합격");

		scanner.close();// 자원반납, scanner의 입력을 제거함
		scanner = null;// garbage collector의 대상, scanner의 주소를 제거함

		return;
	}

}