package com.bj.algo_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10871B {

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// ù° �� �Է°� (N=������ ����, X=���� ��)
		int N, X;
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());

		// ��° �� �Է� �� ���ڿ� �и� �� ���ذ� ���� ���� �� üũ �� ���
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
