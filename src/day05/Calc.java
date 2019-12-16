package day05;

public class Calc {
	//메소드 오버로딩, 가변인자는 파라미터 제일 뒤에 위치한다.
	public static int add(int ... a) {
		int sum = 0;
		for(int i =0; i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	public static int add(int a, int b) {
		return a + b;
	}
}
