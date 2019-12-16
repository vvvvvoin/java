package day02;

public class Test06 {

	public static void main(String[] args) {
		int num = 99;
		num += 1; // num = num + 1
		num += 1; // num = num + 1
		System.out.println(num % 10);
		System.out.println(num / 10);
		System.out.println(num++);
		// System.out.println(++num);
		System.out.println("===================");

		int jumsu = 70;
		boolean flag = (jumsu >= 80);
		System.out.println("우수한가? " + flag);
		flag = (jumsu <= 100) && (jumsu >= 0);
		System.out.println("유효한가? " + flag);

		System.out.println("===================");
		System.out.printf("%c -> %d %n", '0', (int) '0');
		System.out.printf("%c -> %d %n", '1', (int) '1');
		System.out.printf("%c -> %d %n", 'A', (int) 'A'); // 65
		System.out.printf("%c -> %d %n", 'Z', (int) 'Z'); // 90
		System.out.printf("%c -> %d %n", 'a', (int) 'a'); // 97
		// 소문자 -> 대문자 (소문자 - 32)
		char c = 'u';
		System.out.printf("숫자입니까? %b %n", Character.isDigit(c));
		flag = (c >= '0') && (c <= 9);
		System.out.printf("숫자입니까? %b %n", flag);
		flag = (c >= 'a') && (c <= 'z');
		System.out.printf("소문자입니까? %b %n", flag);
		System.out.printf("%c => %c %n", c, (char) (c - 32));

		int score = 50;
		String result = (score >= 70) ? "pass" : "재시험";
		System.out.println(score + " : " + result);
		System.out.println("===================");

		char ch = 'b';
		char r = ((ch >= 'a') && (ch <= 'z')) ? (char) (ch - 32) : ch;
		System.out.println(ch + "->" + r);

		char ch2 = 'B';
		char r2 = ((ch2 >= 'A') && (ch2 <= 'Z')) ? (char) (ch2 + 32) : ch2;
		System.out.println(ch2 + "->" + r2);

	}

}