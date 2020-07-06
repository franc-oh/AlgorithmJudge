package com.bj.input_output;

/**
 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * [(A+B)%C�� ((A%C) + (B%C))%C �� ������? (A��B)%C�� ((A%C) �� (B%C))%C �� ������?]
 * �Է� : ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
 * ��� : ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10430 {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A, B, C;
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		String errMsg = "";
		if(A < 2)
			errMsg = "1��° ���� 2 �̻� �����մϴ�.";
		if(C > 10000)
			errMsg = "3��° ���� 10,000 ���ϸ� �����մϴ�.";

		if("".equals(errMsg)) {
			System.out.println( (A + B) % C );
			System.out.println( ((A % C) + (B % C)) % C );
			System.out.println( (A * B) % C );
			System.out.println(  ((A % C) * (B % C)) % C );

		} else {
			System.out.println(errMsg);
		}

	}

}
