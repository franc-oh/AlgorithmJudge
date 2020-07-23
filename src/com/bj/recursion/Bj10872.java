package com.bj.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10872 {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		System.out.println(calcFacorial(N));

	}

	public static int calcFacorial(int n) {

		if(n <= 1) {
			return 1;
		} else {
			return calcFacorial(n-1) * n;

		}

	}

}
