package com.codeup.algo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cu1953 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		br.close();

		printTriangle(n, n);

	}


	public static void printTriangle(int sCnt, int line) {

		if(line <= 1) {
			System.out.print("*");
			return;
		}

		if(sCnt <= 0) {
			printTriangle(line-1, line-1);
			System.out.println("");
		} else {
			printTriangle(sCnt-1, line);
			System.out.print("*");
		}

	}

}
