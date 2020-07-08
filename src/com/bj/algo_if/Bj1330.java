package com.bj.algo_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
 * ��� : ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
 * 	- A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
 *  - A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
 *  - A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
 *
 * ���� : -10,000 �� A, B �� 10,000
 *
 */
public class Bj1330 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A,B;
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		boolean chk = true;
		if(A < -10000 || B > 10000)
			chk = false;

		if(chk == true) {

			if(A > B) {
				System.out.println(">");
			} else if (A < B) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}

		}

	}

}
