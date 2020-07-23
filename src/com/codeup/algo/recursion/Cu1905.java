package com.codeup.algo.recursion;

import java.util.Scanner;

public class Cu1905 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(sum(n));
	}

	public static long sum(int n) {

		if(n <= 1) return n;

		return n + sum(n-1);
	}

}
