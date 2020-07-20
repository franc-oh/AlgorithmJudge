package com.bj.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10870B {
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

	// 반복패턴을 이용한 피보나치 구현
	public static int calcFinonacci(int n) {

		// n(0)=0, n(1)=1 고정 값
		if(n <= 1) {
			return n;
		}

		int a = 0; // n-2 초기 값( n(0) )
		int b = 1; // n-1 초기 값( n(1) )
		int answer = 0;

		// 2부터 수열계산, 1씩 증감하며 피보나치 구현
		for(int i = 2; i <= n; i++) {
			answer = a + b; // n = (n-1) + (n-2)

			a = b; // n-2 세팅
			b = answer; // n-1 세팅
		}

		return answer;
	}
}
