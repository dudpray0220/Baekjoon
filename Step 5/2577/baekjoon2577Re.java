package Step5;

import java.io.FileInputStream;
import java.util.Scanner;

public class baekjoon2577Re {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input2577.txt"));
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = a * b * c;
		int[] results = new int[10];

		while (x != 0) {
			results[x%10]++;
			x = x/10;
		}
		
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
}
