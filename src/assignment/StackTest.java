package assignment;

import java.util.Arrays;
import java.util.Stack;

import bookapp.Book;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack(-4);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 20; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack {
	private int[] stack;
	int cnt = 0;

	public MyStack() {
		super();
	}

	public MyStack(int stack) {
		super();
		if (stack < 0)
			this.stack = new int[10];
		else
			this.stack = new int[stack];
	}

	public boolean isEmpty() {
		if (cnt != 0)
			return false;
		return true;
	}

	public boolean isFull() {
		if (stack.length == cnt)
			return true;
		return false;
	}

	public void push(int i) {
		if (isFull()) {
			int[]temp = new int[stack.length * 2];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
			temp = null;
		}
		stack[cnt] = i;
		cnt++;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return stack[cnt - 1];
	}

	public int pop() {
		if (isEmpty())
			return -1;
		return stack[--cnt];
	}

}
