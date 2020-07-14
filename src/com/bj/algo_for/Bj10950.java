package com.bj.algo_for;

import java.util.Scanner;

public class Bj10950 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int T;
		T = s.nextInt();

		int A, B;
		for(int i = 0; i < T; i++) {
			A = s.nextInt();
			B = s.nextInt();

			System.out.println(A+B);
		}

		s.close();

	}
}
