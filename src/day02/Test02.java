package day02;

import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		String msg = "hello java";
		System.out.println(msg);

		int size = msg.length();

		System.out.println(size);
		System.out.println(msg.toUpperCase());

		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toLocaleString()); // deprecated 됨

		java.sql.Date date2;

	}

}
