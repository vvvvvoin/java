package util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyUtil {

	public static int[] sort(int[] a) {
		int[] num = a.clone();

		for (int i = 0; i < num.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[min] > num[j])
					min = j;
			}

			if (i != min) {
				swap(num, i, min);

			}
		}

		return num;
	}

	public static void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}

	public static void iteratorPrint(Set<String> list) {
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data + " ");
		}

	}
	
	public static void iteratorPrint(List<String> list) {
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data + " ");
		}

	}
}
