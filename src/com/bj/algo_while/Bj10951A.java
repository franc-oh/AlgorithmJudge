package com.bj.algo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10951A {

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		while((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input);
			int A, B;

			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			System.out.println(A+B);
		}

		br.close();
	}
}
