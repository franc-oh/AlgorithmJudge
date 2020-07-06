package com.bj.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * �� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 * ��� : ù° �ٿ� A/B�� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10(-9) �����̸� �����̴�.
 *
 */

public class Bj1008 {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a, b = 0;

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());


		String errMsg = "";
		if(a <= 0)
			errMsg = "a�� 0���� Ŀ���մϴ�.";
		if(b >= 10)
			errMsg = "b�� 10���� �۾ƾ��մϴ�.";


		if("".equals(errMsg))
			System.out.println((double)a/b);
		else
			System.out.println(errMsg);

		br.close();

	}
}
