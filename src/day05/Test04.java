package day05;

public class Test04 {

	public static void main(String[] args) {
		int[] num = {1,2,3,8,7,4,5,9,3,153,35,84,6,6315,34,86,135};
		for(int data:num) {
			if((data % 2) !=0) System.out.print(data+" ");
			
		}
		System.out.println();
		char[] c = "abcd".toCharArray();
		for(char data:c) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		String[] s = {"hello", "java","test"};
		for(String data : s) {
			if(data.charAt(0)=='j') System.out.println(data);
		}
		
		
		
	}

}
