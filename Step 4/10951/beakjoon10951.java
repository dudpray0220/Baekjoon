package Step4;

import java.io.FileInputStream;
import java.util.Scanner;

public class beakjoon10951 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input10952.txt"));
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);
		}
	}
}
