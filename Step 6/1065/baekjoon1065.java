package Step6;

import java.util.Scanner;

public class baekjoon1065 {
	public static void main(String[] args) {
		// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을
		// 말한다.
		// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다. 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Hansu(n);
	}

	public static void Hansu(int N) {
		// 1부터 99까지는 모두 한수
		int cnt = 0;
		int[] arr = new int[N + 1]; // 1부터 N까지 숫자를 만드는 배열

		if (N < 100) {
			System.out.println(N);
		} else {
			if (N >= 1000) { // 1000이상일때 예외처리
				N = 999;
			}
			cnt = 99;
			for (int i = 100; i <= N; i++) { // 3자리수만 보자 (N은 1000이하 이므로)
				arr[i] = i;
				if (arr[i] / 100 - (arr[i] / 10) % 10 == (arr[i] / 10) % 10 - (arr[i] % 10)) { // 백, 십, 일의자리 활용
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}