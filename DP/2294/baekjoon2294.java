package DP;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2294 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		// 첫째 줄에 n, k가 주어진다. (1 ≤ n ≤ 100, 1 ≤ k ≤ 10,000)
		// 구하는 것 : 동전의 갯수

		System.setIn(new FileInputStream("src/input2294.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 동전의 종류 3
		int k = sc.nextInt(); // 목표 15원

		// 배열만들기 (coin, dp)
		int[] coin = new int[n + 1];
		int[] dp = new int[k + 1];

		// 동전 배열에 넣기
		for (int i = 1; i <= n; i++) {
			coin[i] = sc.nextInt();
		}

		for (int i = 1; i <= k; i++) {
			dp[i] = 10001;
		}

		// dp로직 구현
		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = coin[i]; j <= k; j++) {
				dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
			}
		}
		if (dp[k] == 10001) {
			dp[k] = -1;
		}
		System.out.println(dp[k]);
	}
}
