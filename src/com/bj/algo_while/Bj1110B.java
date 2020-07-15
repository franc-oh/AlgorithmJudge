package com.bj.algo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1110B {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int number = N;
		int cycle = 0;

		do {
			// 10의 자리 = 이전 1의 자리 값 , 1의 자리 = 이전 합계(10의 자리와 1의 자리 합) 1의 자리 값
			number = (number % 10 * 10) + (((number / 10) + (number % 10)) % 10);
			cycle++; // 사이클 증가

		} while (N != number);

		System.out.println(cycle);

	}

}
