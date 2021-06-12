package Step4;

import java.util.Scanner;

public class baekjoon1110 {
	public static void main(String[] args) {
		// 입력처리
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 26
		int cnt = 0;
		
		// 자릿수를 더하는 방법
		int a = (n / 10) + (n % 10); // 2 + 6 = 8
		int b = (n % 10) * 10 + (a % 10); // 68
		cnt++;

		while (true) {
			if (n >= 10) {
				a = (b / 10) + (b % 10); // 6 + 8 = 14
				b = (b % 10) * 10 + (a % 10); // 84
				cnt++;
//				a = (b / 10) + (b % 10); // 8 + 4 = 12
//				b = (b % 10) * 10 + (a % 10); // 42
//				cnt++;
//				a = (b / 10) + (b % 10); // 4 + 2 = 6
//				b = (b % 10) * 10 + (a % 10); // 26
//				cnt++;
				if (b == n) {
					System.out.println(cnt);
					break;
				}
			} else {
				if (b == n) {
					System.out.println(cnt);
					break;
				} else {
					a = (b / 10) + (b % 10); // 6 + 8 = 14
					b = (b % 10) * 10 + (a % 10); // 84
					cnt++;
					if (b == n) {
						System.out.println(cnt);
						break;
					}
				}
			}
		}
	}
}
