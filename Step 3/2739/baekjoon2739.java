package Step3;

import java.util.Scanner;

public class baekjoon2739 {
	public static void main(String[] args) {
		// 입력처리
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		// 로직구현
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
}
