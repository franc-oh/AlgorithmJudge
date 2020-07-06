package com.bj.input_output;

import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력 : 첫째 줄에 A-B를 출력한다.
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
