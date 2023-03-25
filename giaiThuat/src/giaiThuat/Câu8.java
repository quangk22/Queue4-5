package giaiThuat;

import java.util.Scanner;
import java.util.Stack;

public class Câu8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số thập phân cần đổi : ");
		int input = sc.nextInt();
		String dec = decToBin(input);
		System.out.println("Số nhị phân là : " + dec);
	}

	private static String decToBin(int input) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		while (input != 0) {
			int remainder = input % 2;
			stack.push(remainder);
			input /= 2;
		}
		StringBuilder dec = new StringBuilder();
		while (!stack.isEmpty()) {
			dec.append(stack.pop());

		}
		return dec.toString();

	}

}
