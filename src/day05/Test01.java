package day05;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		int size = 5;
		if(args.length !=0) {
			size =Integer.parseInt(args[0]);}
		
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 46);
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
			System.out.println(Arrays.toString(num));

		}
		System.out.println("==============");

		for (int i = 0; i < num.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[min] > num[j])
					min = j;
				System.out.println(Arrays.toString(num));
			}

			if (i != min) {
				int temp = 0;
				temp = num[i];
				num[i] = num[min];
				num[min] = temp;

			}
		}
		System.out.println("===================================================");
		int[] num2 = new int[5];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = (int) (Math.random() * 46);
			for (int j = 0; j < i; j++) {
				if (num2[i] == num2[j]) {
					i--;
					break;
				}
			}
			System.out.println(Arrays.toString(num2));

		}
				
		
		System.out.println("==============");
		for (int i = 0; i < num2.length - 1; i++) {
			for (int j = i + 1; j < num2.length; j++) {
				if (num2[i] > num2[j]) {
					int temp = 0;
					temp = num[i];
					num2[i] = num2[j];
					num2[j] = temp;

				}
				System.out.println(Arrays.toString(num2));
			}

		}

		//System.out.println(Arrays.toString(num2));
	}

}
