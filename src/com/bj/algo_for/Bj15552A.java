package com.bj.algo_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj15552A {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine().trim());

		for(int i = 0; i < T; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");

			int A = Integer.parseInt(word[0]);
			int B = Integer.parseInt(word[1]);

			bw.write((A+B) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
