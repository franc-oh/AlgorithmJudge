package com.bj.algo_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10871A {

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 첫째 줄 입력값 (N=수열의 갯수, X=기준 값)
		int N, X;
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());


		// 두번째 줄 수열 담기
		int numArr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}

		// 두번째 입력 값 중 기준 값보다 작은 수만 출력
		for(int i = 0; i < numArr.length; i++) {
			if(X > numArr[i])
				System.out.print(numArr[i] + " ");

		}

		br.close();
	}

}
