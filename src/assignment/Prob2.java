package assignment;

public class Prob2 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.
		char temp;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sourceString.length(); i++) {
			temp = (sourceString.charAt(i));
			if (temp != ' ')temp += 3;
			if (temp > 122)	temp -= 26;
			sb.append(temp);
		}
		encodedString = sb.toString();
		// 프로그램 구현부 끝.

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

		int year = 2019;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
			System.out.println("나누어짐");
		else
			System.out.println("안나누어짐");

		int sum = 0;
		for (int i = 1; i < 21; i++)
			if (!(i % 2 == 0) || (i % 3 == 0)) {
				sum += i;
			}
		System.out.println(sum);

		int temp2 = 0;
		for (int i = 1; i < 11; i++) {
			for (int j = 10; j >= 1; j--) {
				temp2 += i;
			}
		}
		System.out.println(temp2);
	}

}
