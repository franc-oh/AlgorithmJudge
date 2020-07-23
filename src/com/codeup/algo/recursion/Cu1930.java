package com.codeup.algo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cu1930 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		while((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input);
			int k, n;

			k = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());

			System.out.println(superSum(k, n));
		}

		br.close();

	}
/*
	static int data[][] = new int[15][15];
	public static int superSum(int k, int n) {

		if(k == 0) return n;

		if(data[k][n] != 0) {
			return data[k][n];

		} else {
			for(int i = 1; i <= n; i++) {
				data[k][n] += superSum(k-1, i);
			}

			return data[k][n];

		}


	}
*/

	public static int superSum(int k, int n) {
		if(k == 0) return n;

		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += superSum(k-1, i);

		}

		return sum;


	}


}
