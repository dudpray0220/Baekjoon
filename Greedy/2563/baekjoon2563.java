package Greedy;

import java.io.FileInputStream;
import java.util.Scanner;

public class baekjoon2563 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input2563.txt"));
		Scanner sc = new Scanner(System.in);
		int paperNum = sc.nextInt(); // 3
		int cnt = 0;

		// 가로, 세로가 100인 도화지
		int[][] map = new int[100][100];

		// 색종이의 가로, 세로는 10
		for (int i = 0; i < paperNum; i++) {
			int x = sc.nextInt(); // 3
			int y = sc.nextInt(); // 7
			for (int j = x; j < x + 10; j++) { // 3 ~ 12 (총 10)
				for (int k = y; k < y + 10; k++) { // 7 ~ 16 (총 10)
					if (map[j][k] == 1) {// [3][7], [3][8] ~
						continue;
					} else {
						map[j][k] = 1;
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
