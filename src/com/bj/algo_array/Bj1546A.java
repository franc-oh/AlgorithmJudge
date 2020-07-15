package com.bj.algo_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1546A {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int subCnt = 0;
		subCnt = Integer.parseInt(br.readLine());

		int subArr[] = new int[subCnt];
		StringTokenizer subScoreInput = new StringTokenizer(br.readLine());
		for(int i = 0; i < subCnt; i++) {
			subArr[i] = Integer.parseInt(subScoreInput.nextToken());
		}

		Arrays.sort(subArr);
		br.close();

		int maxScore = subArr[subArr.length-1];
		int totScore = 0;
		for(int i = 0; i < subArr.length; i++) {
			totScore += subArr[i];
		}

		double totAvg = 100.0 * totScore / maxScore / subCnt;
		System.out.println( totAvg );


	}

}
