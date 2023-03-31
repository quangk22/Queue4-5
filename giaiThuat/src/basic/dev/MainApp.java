package basic.dev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		queue.add(10);
		System.out.printf("Trong queue có %d phân tử ",queue.size());
		System.out.println("\nCác phân tử trong queue : " + queue);
		
		 Queue<Integer> daoNguocQueue= reverse(queue);
		 System.out.println("Đảo ngược queue : " + daoNguocQueue);
		 
	}

	private static Queue<Integer> reverse(Queue<Integer> queue) {
		// TODO Auto-generated method stub
		 Stack<Integer> stack = new Stack<>();
	        while (!queue.isEmpty()) {
	            stack.push(queue.remove());
	        }
	        while (!stack.isEmpty()) {
	            queue.add(stack.pop());
	        }
	        return queue;
	    }

}
