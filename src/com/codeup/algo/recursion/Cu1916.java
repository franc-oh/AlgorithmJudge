package com.codeup.algo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cu1916 {

	static long data[] = new long[201];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		br.close();

		System.out.println((fibonacci(n)));

	}

	public static long fibonacci(int n) {

		if(n <= 2) {
			return 1;
		}

		if(data[n] != 0) {
			// 이미 계산이 된 경우(메모리에 값 있음), 연산이 아닌 데이터 활용
			return data[n];
		} else {
			// 아직 계산이 안된 경우(메모리에 값 없음), 연산 후 메모리에 저장
			return data[n] = (fibonacci(n-1) + fibonacci(n-2)) % 10009;
		}
	}

}
