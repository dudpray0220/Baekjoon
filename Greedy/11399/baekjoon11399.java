package Greedy;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon11399 {
	public static void main(String[] args) throws Exception {
		// 사람은 1번부터 N번까지 번호가 매겨져 있으며, i번 사람이 돈을 인출하는데 걸리는 시간은 Pi분이다.
		// 줄을 서 있는 사람의 수 N과 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어졌을 때, 각 사람이 돈을 인출하는데 필요한 시간의 합의
		// 최솟값을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 사람의 수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄에는 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어진다. (1
		// ≤ Pi ≤ 1,000)
		// 첫째 줄에 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 출력한다
		System.setIn(new FileInputStream("src/Greedy/input11399.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 사람 수
		int[] arr = new int[n + 1];
		int sum = 0;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		for (int i = 1; i <= n; i++) {
			sum += arr[i];
			answer += sum;
		}

		System.out.println(answer);
	}
}
