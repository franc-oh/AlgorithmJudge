package com.bj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2798A {

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
		int sum = 0;
		int result = 0;
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {

                for(int k=j+1; k<N; k++) {
					sum = numArr[i] + numArr[j] + numArr[k];

					if(M >= sum && sum > result)
						result = sum;
				}

			}
		}

		System.out.println(result);

	}

}
