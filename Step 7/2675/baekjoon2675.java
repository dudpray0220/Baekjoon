package Step7;

import java.util.Scanner;

public class baekjoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트케이스
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt(); // 반복횟수
			String s = sc.next(); // 입력 문자열

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
