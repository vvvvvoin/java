package day09;

public class Test05 {

	public static void main(String[] args) {
		System.out.println("Start");

		String msg = "10";
		int num = 0;
		int res = 0;

		try {
			num = Integer.parseInt(msg);
			res = 1000 / num;
			int[] number = new int[num];
		} catch (NumberFormatException e) {
			System.out.println("문제발생 : " + e);
			System.out.println("숫자로 입력된 문자열이 필요합니다");
		} catch (ArithmeticException e) {
			System.out.println("문제발생 : " + e);
			System.out.println("0을 제외한 숫자로 입력된 문자열이 필요합니다");
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println("문제 발생  : " + e);
		} finally {
			System.out.println("자원반납코드 항상 수행");
		}

		System.out.println(num);
		System.out.println(res);
		System.out.println("end");
	}

}
