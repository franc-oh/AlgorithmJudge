package com.codeup.algo.recursion;

import java.util.Scanner;

public class Cu1902 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		calc(sc.nextInt());
	}


	public static void calc(int n) {

		if(n < 1) {
			return;
		}

		// 재귀함수는 스택(LIFO)에 쌓기 때문에, 재귀가 스택에 쌓이기 전 출력하면 n~1까지 역순 출력이 된다.
		System.out.println(n);
		calc(n-1);

	}

}
