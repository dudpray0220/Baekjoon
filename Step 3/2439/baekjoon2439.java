package Step3;

import java.util.Scanner;

public class baekjoon2439 {
	public static void main(String[] args) {
		// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다 (오른쪽을 기준으로 정렬한 별)
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 5

		for (int i = 0; i < N; i++) { // 0, 1, 2, 3, 4 (5줄)
			for (int j = i + 1; j < N; j++) { // 1, 2, 3, 4 / 2, 3, 4 / 3, 4 / 4
				System.out.print(" ");
			}
			for (int k = N - i; k <= N; k++) { // 5 / 4, 5 / 3, 4, 5 / 2, 3, 4, 5 / 1, 2, 3, 4, 5
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
