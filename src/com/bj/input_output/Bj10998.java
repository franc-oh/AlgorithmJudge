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
			errMsg = "a는 0보다 커야합니다.";
		if(b >= 10)
			errMsg = "b는 10보다 작아야합니다.";

		if("".equals(errMsg))
			System.out.println(a*b);
		else
			System.out.println(errMsg);

	}

}
