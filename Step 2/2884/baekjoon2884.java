package Step2;

import java.util.Scanner;

public class baekjoon2884 {
	public static void main(String[] args) {
		// 입력처리
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		// 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간
		// H시 M분을 의미한다.
		if (M > 45) {
			System.out.println(H + " " + (M - 45));
		} else if (M == 45) {
			System.out.println(H + " " + 0);
		} else {
			if (H == 0) {
				System.out.println(23 + " " + (60 - (45 - M)));
			} else {
				System.out.println((H - 1) + " " + (60 - (45 - M)));
			}
		}
	}
}
