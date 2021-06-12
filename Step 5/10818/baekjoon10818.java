package Step5;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon10818 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input10818.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열 길이

		// 배열만들기
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
