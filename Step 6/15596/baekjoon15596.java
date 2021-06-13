package Step6;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon15596 {
	// Java: long sum(int[] a); (클래스 이름: Test)
	// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
	// 리턴값: a에 포함되어 있는 정수 n개의 합

	public static void main(String[] args) {
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = 3;
		}
		new Test().sum(arr);
	}
	
	static class Test {
		long sum(int[] a) {
			long total = 0;

			for (int i = 0; i < a.length; i++) {
				total += a[i];
			}
			System.out.println(total);
			return total;
		}
	}
}
