package Greedy;

import java.io.FileInputStream;
import java.util.Scanner;

public class baekjoon2567 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input2567.txt"));
		Scanner sc = new Scanner(System.in);
		int paperNum = sc.nextInt(); // 4
		int cnt = 0;
		// 도화지 가로, 세로 100
		int[][] map = new int[101][101];

		// 색종이의 모든면을 1로 칠한다.
		for (int i = 0; i < paperNum; i++) {
			int x = sc.nextInt(); // 3
			int y = sc.nextInt(); // 7
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					map[j][k] = 1;
				}
			}
		}

		// 1로 칠한 색종이의 둘레만 구하여 cnt++을 해준다.
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == 1) {
					if (map[i][j - 1] == 0) {
						cnt++;
					}
					if (map[i][j + 1] == 0) {
						cnt++;
					}
					if (map[i+1][j] == 0) {
						cnt++;
					}
					if (map[i-1][j] == 0) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
