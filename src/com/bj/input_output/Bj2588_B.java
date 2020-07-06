package com.bj.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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



public class Bj2588_B {

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

		System.out.println( a * (b%10) );
		System.out.println( a * ((b/10)%10) );
		System.out.println( a * (b/100) );
		System.out.println( a * b );

		br.close();

	}

}
