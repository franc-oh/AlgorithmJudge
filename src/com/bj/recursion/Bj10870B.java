package com.bj.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10870B {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		br.close();

		/*
		for (int i = 1; i <= N; i++) {
            System.out.println("=========== (" + i + ")" + calcFinonacci(i));
        }
        */

		System.out.println(calcFinonacci(N));

	}

	// �ݺ������� �̿��� �Ǻ���ġ ����
	public static int calcFinonacci(int n) {

		// n(0)=0, n(1)=1 ���� ��
		if(n <= 1) {
			return n;
		}

		int a = 0; // n-2 �ʱ� ��( n(0) )
		int b = 1; // n-1 �ʱ� ��( n(1) )
		int answer = 0;

		// 2���� �������, 1�� �����ϸ� �Ǻ���ġ ����
		for(int i = 2; i <= n; i++) {
			answer = a + b; // n = (n-1) + (n-2)

			a = b; // n-2 ����
			b = answer; // n-1 ����
		}

		return answer;
	}
}
