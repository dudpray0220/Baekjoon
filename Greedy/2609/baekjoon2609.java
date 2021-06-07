package Greedy;

import java.io.FileInputStream;
import java.util.Scanner;

public class baekjoon2609 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input2609.txt"));
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int gcdValue = gcd(x, y);
		int icmValue = icm(x, y, gcdValue);

		System.out.println(gcdValue);
		System.out.println(icmValue);
	}

	// 유클리드 호제법 이용 최대공약수 로직
	public static int gcd(int x, int y) {
		if (y > x) {
			int temp = x;
			x = y;
			y = temp;
			return gcd(y, x % y);
		} else if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}

	// 최소공배수 로직 (x * y / gcd)
	public static int icm(int x, int y, int gcdValue) {
		int icmValue = x * y / gcdValue;
		return icmValue;
	}
}
