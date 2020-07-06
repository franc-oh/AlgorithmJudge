package com.bj.input_output;

/**
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * [(A+B)%C는 ((A%C) + (B%C))%C 와 같을까? (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?]
 * 입력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * 출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
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
			errMsg = "1번째 수는 2 이상만 가능합니다.";
		if(C > 10000)
			errMsg = "3번째 수는 10,000 이하만 가능합니다.";

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
