package com.bj.input_output;

import java.util.Scanner;

public class Bj10998 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b = 0;
		String errMsg = "";

		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();

		if(a <= 0)
			errMsg = "a�� 0���� Ŀ���մϴ�.";
		if(b >= 10)
			errMsg = "b�� 10���� �۾ƾ��մϴ�.";

		if("".equals(errMsg))
			System.out.println(a*b);
		else
			System.out.println(errMsg);

	}

}
