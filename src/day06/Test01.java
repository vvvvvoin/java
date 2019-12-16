package day06;

import java.util.Arrays;

import day05.Calc;
import util.MyUtil;

public class Test01 {
	public static void main(String[] args) {
		
		int i = Calc.add(1,2,3,4,5,6,7,8,9,10);
		System.out.println(i);
		
		i = Calc.add();
		System.out.println(i);
		
		System.out.println(Calc.add(1, 2,5,7,345,34,4));
		System.out.println();
		System.out.println("==============================");
		int[] d = {1,28,83,44,53,6,75,85,9,10};
		int[] r = MyUtil.sort(d);
		
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(r));
		System.out.println("==============================");
		System.out.println(MyUtil.max(55, 11));
		

	}

}
