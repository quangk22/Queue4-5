package giaiThuat;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Câu2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("Nhập số PT : ");
		int a = sc.nextInt();
		System.out.printf("Nhập %d PT cho stack : \n", a);
		for (int i = 0; i < a; i++) {

			int v = sc.nextInt();
			stack.push(v);
		}
		int size = stack.size();
		// Câu 2.a
		System.out.println("số phân tử trong stack : " + size);
		// Câu 2.b
		System.out.println("nhập vị trí muốn lấy : ");
		int n = sc.nextInt();
		int inND;
		if (n >= 0 && n < size) {
			int index = stack.size() - n;
			inND = stack.get(index);
			System.out.println("Nội dung : " + inND);
		} else {
			System.out.printf("Không tìm thấy phân tử thứ %d \n", n);
		}
		// câu 2.c
		System.out.println("Nội dung trong stack : " + stack);

		// Câu 4
		daoNguocStack(stack);
	}

	private static void daoNguocStack(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> list = new ArrayList<>(stack);
		 stack.clear();
		 for (int i = list.size() - 1; i >= 0; i--) {
	            int element = list.get(i);
	            stack.push(element);
	        }
		 System.out.println("Stack sau khi đảo ngược : " +stack);
	}

}
