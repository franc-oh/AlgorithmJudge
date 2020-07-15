package com.bj.algo_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10818A {

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


		int maxNum = 0;
		int minNum = 0;
		for(int i = 0; i < valArr.length; i++) {
			int currNum = valArr[i];

			if(i == 0) {
				maxNum = currNum;
				minNum = currNum;
			}

			if(maxNum < currNum) {
				maxNum = currNum;
			}
			if(minNum > currNum) {
				minNum = currNum;
			}
		}

		System.out.println(minNum + " " + maxNum);

	}
}
