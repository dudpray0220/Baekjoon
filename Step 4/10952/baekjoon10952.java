package Step4;

import java.io.FileInputStream;
import java.util.Scanner;

public class baekjoon10952 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input10952.txt"));
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 & b == 0) {
				break;
			}

			System.out.println(a + b);
		}
	}
}
