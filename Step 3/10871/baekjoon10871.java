package Step3;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon10871 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input10871.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		// 배열만들기
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < x) {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
	}
}
