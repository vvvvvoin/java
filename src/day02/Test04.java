package day02;

public class Test04 {

	public static void main(String[] argu) {
		int num = 100;
		num = num + 20;

		int i = 99, j = 77;
		System.out.printf("i=%d, j=%d %n", i, j);

		int temp1 = j;
		j = i;
		i = temp1;
		System.out.printf("i=%d, j=%d %n", i, j);

		System.out.println("========================");

		char c1 = 'B', c2 = 'w';
		System.out.printf("c1=%c, c2=%c %n", c1, c2);

		char temp2 = c1;
		c1 = c2;
		c2 = temp2;
		System.out.printf("c1=%c, c2=%c %n", c1, c2);

		System.out.println("========================");

		String s1 = "hello", s2 = "java";
		System.out.printf("s1=%s, s2=%s %n", s1, s2);

		String temp3 = s1;
		s1 = s2;
		s2 = temp3;
		System.out.printf("s1=%s, s2=%s %n", s1, s2);
	}

}
