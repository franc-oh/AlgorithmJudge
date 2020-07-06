package com.bj.input_output;

/*
 * A(�� �ڸ� ��) * B(�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
 *
 * (1) ==   A �Է� ��
 * (2) == * B �Է� ��
 * -----------------
 * (3) ==   (A * (B�� 1���ڸ� ��) )
 * (4) == + (A * (B�� 10���ڸ� ��) )
 * (5) == + (A * (B�� 100���ڸ� ��) )
 * -----------------
 * (6) == A * B
 *
 *
 * �Է� : ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
 * ��� : ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.
 *
 */

import java.util.Scanner;

public class Bj2588_A {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		/* Ǯ�̹� 1 */

		int a,b;
		a = s.nextInt();
		b = s.nextInt();

        System.out.println( a * (b % 10) );
        System.out.println( a * ((b / 10) % 10) );
        System.out.println( a * (b / 100) );
        System.out.println( a * b );



        /* Ǯ�̹� 2

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
