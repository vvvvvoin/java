package assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Prob3 {

	public static void main(String[] args) {
		String[] strData = { "Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };
		
		for (int i = 0; i < strData.length; i++) {
			System.out.println(strData[i]);
			for (int j = strData[i].length() - 1; j >= 0; j--) {
				System.out.print(strData[i].charAt(j));
			}
			System.out.println();
			
			
		}
		System.out.println("=====================");		
		
		for (int i = 0; i < strData.length; i++) {
			System.out.println(strData[i]);
			for (int j = 1; j <= strData[i].length(); j++) {
				System.out.print(strData[i].charAt(strData[i].length()-j));
			}
			System.out.println();
		}
		System.out.println("=====================");

		int sum1 = 0;
		for (int num = 1; num < 200; num++) {
			if (num % 2 != 0)
				sum1 += num;
			else
				sum1 -= num;
			System.out.println("sum1=" + sum1);
		}
		System.out.println("=====================");

		int sum2 = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		for(int i =0;i < arr.length; i++)
		{
			sum2 += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("sum2=" + sum2);
		System.out.println("=====================");
		
		int[] rend = new int[10];
		for(int i = 0; i<rend.length;i++)
		{
			rend[i] = (int)(Math.random()*101);
		}
		System.out.println(Arrays.toString(rend));

		for(int i = 0; i<rend.length-1;i++)
		{
			for(int j = rend.length-1; i>-1;i--)
			{
				if(rend[i] == rend[j]) {
					
				}
			}
		}
		System.out.println(Arrays.toString(rend));
		

	}

}
