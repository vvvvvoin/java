package day04;

public class Test04 {

	public static void main(String[] args) {
		int[] eng;
		eng = new int[5];
		double sum = 0;
		double avg = 0.0;

		eng[0] = 99;
		eng[1] = 88;
		eng[2] = 100;
		eng[3] = 81;
		eng[4] = 57;

		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i] + " ");
			sum += eng[i];
		}
		avg = sum / eng.length;
		System.out.printf("%n 합계 : %.2f 평균 점수 : %.2f %n", sum, avg);

		String[] names = new String[5];
		names[0] = "가길동";
		names[1] = null;
		names[2] = "다길동";
		names[3] = "라길동";
		names[4] = "마길동";

		for (int i = 0; i < names.length; i++) {
			if (names[i] != null && names[i].length() > 0) {
				System.out.print(names[i].charAt(0) + "** ");
				System.out.print("영어성적 : " + eng[i]);
				System.out.println();
			}
		}
	}
}