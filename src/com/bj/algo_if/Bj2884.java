package com.bj.algo_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * https://www.acmicpc.net/problem/2884
 */
public class Bj2884 {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int H,M;
		H = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		String result = "";
		int min = (M - 45);
		if( min >= 0 ) {
			result = H + " " + min;

		} else {
			if(H == 0) {
				H = 24;
			}

			result = (H-1) + " " + (60 + min);
		}

		System.out.println(result);

		br.close();
	}

}
