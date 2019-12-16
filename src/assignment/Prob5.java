package assignment;

public class Prob5 {
	public static void main(String args[]) {
		
		System.out.println(Prob5.leftPad("SDS", 6, '#'));
		System.out.println(Prob5.leftPad("SDS", 5, '$'));
		System.out.println(Prob5.leftPad("SDS", 2, '&'));
		
		Prob5 p5 = new Prob5();
		System.out.println(p5.rightPad("SDS", 6, '#'));
		System.out.println(p5.rightPad("SDS", 5, '$'));
		System.out.println(p5.rightPad("SDS", 2, '&'));
	}
	//static method를 클래스 메소드라고 함
	public static String leftPad(String str, int size, char padChar) {
		StringBuilder sb = new StringBuilder();
		if (size < str.length()) {
			return str;
		} else {
			int count = (size- str.length());
			for (int i = 0; i < count; i++) {
				
				sb.append(padChar);
				
			}			
			return sb.append(str).toString();
		}
	}
	//instance method new를 이용하여 사용하여 instance 후 주소를 이용하여 접근
	public String rightPad(String str, int size, char padChar) {
		StringBuilder sb = new StringBuilder();
		if (size < str.length()) {
			return str;
		} else {
			int count = (size- str.length());
			sb.append(str);
			for (int i = 0; i < count; i++) {
				
				sb.append(padChar);
				
			}			
			return sb.toString();
		}
	}
}
