package com.bj.input_output;

import java.util.Scanner;

/**
 * �� ���� A�� B�� �Է¹��� ����, A-B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 * ��� : ù° �ٿ� A-B�� ����Ѵ�.
 *
 */

public class Bj1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();

		System.out.println(a-b);

	}
}
