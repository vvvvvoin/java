package day09;

public class Test06 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");
		try {
			throw new Exception("예외 실습 !!!!!");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}

}
