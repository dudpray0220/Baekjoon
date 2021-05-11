package Challenge;

import java.io.FileInputStream;
import java.util.Scanner;

public class ArraySumb2167 {
	public static void main(String[] args) throws Exception {
		// 파일입력처리
		System.setIn(new FileInputStream("src/inputAS.txt"));
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();

		// 2차원배열 만들기 (수학처럼 계산하기 편하게 (1,1) 이런식으로 하기위해 +1함.
		int[][] arr = new int[R + 1][C + 1];
		
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 로직구현
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			int sum = 0;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for (int j = x1; j <= x2; j++) {
				for (int k = y1; k <= y2; k++) {
					sum += arr[j][k];
				}
			}
			System.out.println(sum);
		}
	}
}
