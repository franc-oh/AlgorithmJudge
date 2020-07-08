package com.bj.algo_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * https://www.acmicpc.net/problem/2884
 */
public class Bj2884_B {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int H,M;
		H = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		int time = (H * 60) + M;
		int calH = (time - 45) / 60;
		int calM = (time - 45) % 60;

		if(calM < 0) {
			calH = 23;
			calM = 60 - (45 - M);
		}

		System.out.println(calH + " " + calM);

		br.close();
	}

}
