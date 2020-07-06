package com.bj.input_output;

/**
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * 입력 : 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * 출력 : 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
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
			errStr = "1번째 자연수는 1이상만 가능 합니다.";
		if(b > 10000)
			errStr = "2번째 자연수는 10,000 이하만 가능 합니다.";

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
