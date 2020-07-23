package com.codeup.algo.recursion;

import java.util.Scanner;

public class Cu1912 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(factorial(n));
	}

	public static long factorial(int n) {

		if(n <= 1) return n;

		return n * factorial(n-1);
	}

}
