package com.bj.input_output;

/*
 * A(세 자리 수) * B(세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *
 * (1) ==   A 입력 값
 * (2) == * B 입력 값
 * -----------------
 * (3) ==   (A * (B의 1의자리 수) )
 * (4) == + (A * (B의 10의자리 수) )
 * (5) == + (A * (B의 100의자리 수) )
 * -----------------
 * (6) == A * B
 *
 *
 * 입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 *
 */

import java.util.Scanner;

public class Bj2588_A {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		/* 풀이법 1 */

		int a,b;
		a = s.nextInt();
		b = s.nextInt();

        System.out.println( a * (b % 10) );
        System.out.println( a * ((b / 10) % 10) );
        System.out.println( a * (b / 100) );
        System.out.println( a * b );



        /* 풀이법 2

		int a = s.nextInt();
		String b = s.next();

		System.out.println( a * (b.charAt(2) - '0') );
		System.out.println( a * (b.charAt(1) - '0') );
		System.out.println( a * (b.charAt(0) - '0') );
		System.out.println( a * Integer.parseInt(b) );

         */



		s.close();

	}

}
