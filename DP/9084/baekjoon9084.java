package DP;

import java.io.FileInputStream;
import java.util.Scanner;

public class baekjoon9084 {
	public static void main(String[] args) throws Exception {
		// System.setIn(new FileInputStream("src/input9084.txt"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트케이스 3

		for (int testcase = 0; testcase < t; testcase++) { // 테스트케이스 3번 도는 반복문
			int coinNum = sc.nextInt(); // 동전가짓수 2

			// 배열만들기
			int[] coin = new int[coinNum + 1];

			for (int i = 1; i <= coinNum; i++) {
				coin[i] = sc.nextInt();
			}

			int m = sc.nextInt(); // 동전으로 만들어야 할 금액 1000
			int[] dp = new int[m + 1]; // dp배열
			dp[0] = 1; // 초기값 선언

			// dp 로직구현 (모든 경우의 수)
			for (int i = 1; i <= coinNum; i++) { // 세로로직 1, 2
				for (int j = coin[i]; j <= m; j++) { // 가로로직 1~1000, 2~1000
					dp[j] = dp[j] + dp[j - coin[i]];
				}
			}
			System.out.println(dp[m]);
		}
	}
}