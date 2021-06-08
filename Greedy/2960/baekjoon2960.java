package Greedy;

import java.io.FileInputStream;
import java.util.Scanner;

public class baekjoon2960 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input2960.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 10
		int K = sc.nextInt(); // 7
		int cnt = 0;

		// 2, 3, 4, 5, 6, 7, 8, 9, 10
		// P = 2 (소수)
		// P = 2를 지우고 -> 4, 6, 8, 10 (P의 배수를 크기 순서대로 지움)
		// 3, 5, 7, 9
		// P = 3 -> 3, 9 (9가 K번째 지워진 수)
		// 5, 7
		// P = 5
		// 7
		// P = 7
		// N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.
		
		
		// 배열만들어서 값 넣어주기
		int[] arr = new int[N + 1];
		for (int i = 2; i <= N; i++) { // 편하게 arr[2] = 2부터 ~ arr[10] = 10, 배열길이 11로 함.
			arr[i] = i; // 2 ~ 10
		}
		
		// 로직구현
		for (int i = 2; i <= N; i++) { // 2 ~ 10
			for (int j = i; j <= N; j += i) { // 2, 4, 6, 8, 10 / 3, 6, 9 / 5 / 7
				if (arr[j] > 0) { // 0보다 크다는건 아직 안지워졌다는거다.
					arr[j] = 0;   // 아직 지우지 않은 수 중 가장 작은수 p를 지운다.
					cnt++;
					if (cnt == K) {
						System.out.println(j);
					}
				} else if (arr[j] == 0) {
					continue;
				}
			}
		}
	}
}
