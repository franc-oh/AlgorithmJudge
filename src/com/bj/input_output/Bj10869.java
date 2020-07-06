package com.bj.input_output;

/**
 * �� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : �� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)
 * ��� : ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10869 {

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		String errStr = "";
		if(a < 1)
			errStr = "1��° �ڿ����� 1�̻� ���� �մϴ�.";
		if(b > 10000)
			errStr = "2��° �ڿ����� 10,000 ���ϸ� ���� �մϴ�.";

		if("".equals(errStr)) {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		} else {
			System.out.println(errStr);
		}

	}

}
