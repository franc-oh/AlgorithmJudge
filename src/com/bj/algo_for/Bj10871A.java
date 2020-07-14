package com.bj.algo_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10871A {

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// ù° �� �Է°� (N=������ ����, X=���� ��)
		int N, X;
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());


		// �ι�° �� ���� ���
		int numArr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}

		// �ι�° �Է� �� �� ���� ������ ���� ���� ���
		for(int i = 0; i < numArr.length; i++) {
			if(X > numArr[i])
				System.out.print(numArr[i] + " ");

		}

		br.close();
	}

}
