package Step3;

import java.util.Scanner;

public class baekjoon2438 {
	public static void main(String[] args) {
		// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
