package com.codeup.algo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cu1920 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Integer.parseInt(br.readLine());

		br.close();

		calc(n);

	}

	public static void calc(long n) {

		if(n <= 1) {
			System.out.println(n);
			return;
		}

		if(n % 2 == 0) {
			calc(n/2);

		} else {
			calc((n * 3) + 1);
		}

		System.out.println(n);


	}
}
