package Step5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2562 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input2562.txt"));
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int cnt = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				cnt = i;
			}
		}
		System.out.println(max);
		System.out.println(cnt+1);
	}
}
