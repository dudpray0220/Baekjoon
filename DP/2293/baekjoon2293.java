package DP;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2293 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input2293.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 동전의 종류 3
		int k = sc.nextInt(); // 목표는 10원

		// n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 이 동전을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다.
		// 그 경우의 수를 구하시오. 각각의 동전은 몇 개라도 사용할 수 있다.
		// 사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다. 첫째 줄에 경우의 수를 출력한다. 경우의 수는 231보다 작다.
		// 첫째 줄에 n, k가 주어진다. (1 ≤ n ≤ 100, 1 ≤ k ≤ 10,000) 다음 n개의 줄에는 각각의 동전의 가치가 주어진다. 동전의 가치는 100,000보다 작거나 같은 자연수이다.
		// 구하는 것 : 경우의 수
		
		int coin [] = new int [n+1]; // 동전이 들어있는 배열
		int dp [] = new int [10001]; // 경우의 수가 들어있는 배열
		
		// 동전 넣기
		for (int i = 1; i <= n; i++) {
			coin[i] = sc.nextInt();
		}

		dp[0] = 1; // dp의 초기값 선언 (중요!)
		
		for (int i = 1; i <= n; i++) { // 1, 2, 5 도는 for문
			for (int j = coin[i]; j <= k; j++) { // 1~10, 2~10, 5~10 도는 for문
				dp[j] = dp[j] + dp[j - coin[i]];
			}
		}
		System.out.println(dp[k]);
	}
}
