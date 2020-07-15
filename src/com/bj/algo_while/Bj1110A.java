package com.bj.algo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1110A {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		br.close();

		// 초기 값 세팅
		int init1 = (N / 10);
		int init2 = (N % 10);

		int num1 = (N / 10);
		int num2 = (N % 10);
		int sum = 0;
		int cycle = 0;

		while(true) {
			sum = num1 + num2; // 10의 자리 값과 1의 자리 값 합계
			num1 = num2; // 10의 자리 = 1의 자리 값
			num2 = (sum % 10); // 1의자리 = 합계의 1의 자리 값

			cycle++; // 사이클 증가

			// 초기 입력값과 새로운 수가 같으면 반복 종료
			if(num1 == init1 && num2 == init2) {
				break;
			}

		}

		System.out.println(cycle);

	}

}
