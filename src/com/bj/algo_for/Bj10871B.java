package com.bj.algo_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10871B {

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 첫째 줄 입력값 (N=수열의 갯수, X=기준 값)
		int N, X;
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());

		// 둘째 줄 입력 값 문자열 분리 후 기준값 보다 작은 지 체크 후 출력
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int val = Integer.parseInt(st.nextToken());

			if(X > val)
				sb.append(val).append(" ");

		}

		System.out.println(sb);
		br.close();
	}

}
