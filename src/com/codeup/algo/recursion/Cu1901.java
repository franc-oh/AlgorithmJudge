package com.codeup.algo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cu1901 {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		calc(Integer.parseInt(br.readLine()));
		br.close();

	}

	public static void calc(int n) {

		if(n < 1) {
			return;
		}

		// 재귀함수는 스택(LIFO)에 쌓기 때문에, 맨 마지막 호출 함수부터 출력되어, n도 1부터 출력된다.
		calc(n-1);
		System.out.println(n);
	}

}
