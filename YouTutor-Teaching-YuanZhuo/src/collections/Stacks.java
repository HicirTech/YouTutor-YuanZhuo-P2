package collections;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack b = new Stack();
		b.push(1);
		b.push(2);
		b.push(3);
		
		System.out.println(b.peek());
		System.out.println(b.pop());
		System.out.println(b);
	}

}
