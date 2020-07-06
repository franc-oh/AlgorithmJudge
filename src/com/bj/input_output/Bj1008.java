package com.bj.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력 : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10(-9) 이하이면 정답이다.
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
			errMsg = "a는 0보다 커야합니다.";
		if(b >= 10)
			errMsg = "b는 10보다 작아야합니다.";


		if("".equals(errMsg))
			System.out.println((double)a/b);
		else
			System.out.println(errMsg);

		br.close();

	}
}
