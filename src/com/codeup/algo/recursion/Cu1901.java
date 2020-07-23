package com.codeup.algo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cu1901 {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		calc(Integer.parseInt(br.readLine()));
		br.close();

	}

	public static void calc(int n) {

		if(n < 1) {
			return;
		}

		// ����Լ��� ����(LIFO)�� �ױ� ������, �� ������ ȣ�� �Լ����� ��µǾ�, n�� 1���� ��µȴ�.
		calc(n-1);
		System.out.println(n);
	}

}
