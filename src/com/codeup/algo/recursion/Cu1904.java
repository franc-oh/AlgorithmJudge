package com.codeup.algo.recursion;

import java.util.Scanner;

public class Cu1904 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		printNum(a, b);
	}

	public static void printNum(int min, int num) {

		if(min > num) return;

		printNum(min, num-1);

		if(num % 2 != 0) {
			System.out.print(num + " ");
		}
	}

}
