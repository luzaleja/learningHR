package hackerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuesAndStacks {

	public static void main(String[] args) {

		Queue<Character> queue = new LinkedList<>();
		
		Stack<Character> stack = new Stack<>();
		
		queue.add('c');
		queue.isEmpty();
		queue.remove();
		queue.size();
		queue.peek();
		
		stack.push('d');
		stack.empty();
		stack.pop();
		stack.size();
		stack.peek();
		
	}

}
