package com.bj.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10870A {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		br.close();

		/*
		for (int i = 1; i <= N; i++) {
            System.out.println("=========== (" + i + ")" + calcFinonacci(i));
        }
        */

		System.out.println(calcFinonacci(N));

	}

	// 재귀함수를 이용한 피보나치 구현
	public static int calcFinonacci(int n) {
		if(n <= 1)
			return n;
		else
			return calcFinonacci(n-1) + calcFinonacci(n-2);
	}
}
