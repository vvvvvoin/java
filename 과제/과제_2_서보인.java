package assignment;

public class Prob2 {

	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		char temp = ' ';
		for(int i = 0; i< sourceString.length()-1;i++)
		{
			temp = sourceString.charAt(i);
			if (temp != ' ')temp += 3;
			System.out.println(temp);
			encodedString +=temp;

		}


		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

	}

}
