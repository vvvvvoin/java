package day02;

public class Test05 {

	public static void main(String[] args) {
		int num = 127;
		System.out.println(num);

		char c = '9';
		int a = '1';
		System.out.printf("숫자입니까? %b %n", Character.isDigit(c));
		System.out.printf("숫자입니까? %b %n", Character.isDigit(a));

		System.out.println("abc" + "def"); // 문자열에 +는 성능저하의 원인
		System.out.println(1 + 1 + 1);
		System.out.println(1 + 1 + "1"); // 1+1까지 연산 후 스트링을 인식후 2를 스트링으로 변환
		System.out.println("1" + 1 + 1);

		String s1 = "100" + 1;
		int s2 = Integer.parseInt("100") + 1;
		System.out.printf("s1 = %s, s2 = %d %n", s1, s2);

		double s3 = Double.parseDouble("100.5") + 1;
		System.out.printf("s3 = %f %n", s3);

		int s4 = (int) Double.parseDouble("100.5") + 1;
		System.out.printf("s4 = %d %n", s4);

		System.out.println(Math.PI); // 3.141592653589793

	}

}
