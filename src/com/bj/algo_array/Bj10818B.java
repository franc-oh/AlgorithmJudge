package com.bj.algo_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj10818B {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numCnt = 0;

		numCnt = Integer.parseInt(br.readLine());

		int valArr[] = new int[numCnt];
		StringTokenizer val = new StringTokenizer(br.readLine());
		for(int i = 0; i < numCnt; i++) {
			valArr[i] = Integer.parseInt(val.nextToken());
		}

		br.close();


		Arrays.sort(valArr);

		System.out.println(valArr[0] + " " + valArr[valArr.length -1]);

	}
}
