package com.bj.algo_while;

import java.util.Scanner;

public class Bj10951B {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		while(s.hasNextInt()) {
			int A, B;
			A = s.nextInt();
			B = s.nextInt();
			System.out.println(A+B);
		}
		s.close();
	}
}
