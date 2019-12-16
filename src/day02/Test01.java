package day02;

public class Test01 {
	// 클래스의 구성요소
	// data(변수 = member variable) + 기능(함수 = method)

	public static void main(String[] args) {
		// data(local variable) 초기화해야 사용가능
		// 기본형
		int i = 900;
		long i2 = 21474836489999l;
		
		double f = 99.9;
		float f2 = (float)f;
		
		
		char c = 'A';
		int c2 = c; // 자동 형변환 프로모션 char -> int
		int c3 = 97;
		char c4 = (char) c3; // 형변환 케스팅 int -> char

		System.out.println(c);
		System.out.println(c2);
		System.out.println(c4);

		System.out.println("==============");
		System.out.printf("1/2 = %d %n", 1/2);
		System.out.printf("1/2. = %.2f %n", 1/2.);
		System.out.println("==============");
		
		boolean b = true;
		
		
		
//		System.out.printf("%d, %f, %c, %b %n", i, f, c, b);
//		System.out.printf("%s, %s, %s, %s %n", i, f, c, b);
//		System.out.printf("i=%d, f-%.2f, c=%c, b=%b %n", i, f, c, b);
//		
//		// 참조형
//		String name = "홍길동";
//		System.out.println(name);

	}

}
