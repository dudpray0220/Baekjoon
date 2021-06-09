package Step3;

import java.io.FileInputStream;
import java.util.Scanner;

public class baekjoon11022 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input11021.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
		}
	}
}
