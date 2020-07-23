package com.bj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2798B {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// Input Line1
		int N, M;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());


		// Input Line2
		st = new StringTokenizer(br.readLine());

		int numArr[] = new int[N];
		for(int i=0; i<N; i++) {
			numArr[i] = Integer.parseInt(st.nextToken(" "));
		}

		br.close();


		// calc BlackJack
		int result = getResult(0, N, M, numArr);
		System.out.println(result);

	}

	public static int getResult(int idx, int cardNum, int max, int cards[]) {
		int result = 0;
		int sum = 0;

		if(max == sum) {
			return sum;

		} else if(idx == cardNum) {
			return result;
		}

		return 0;
	}

}
