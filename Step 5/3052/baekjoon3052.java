package Step5;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon3052 {
	public static void main(String[] args) throws Exception {
		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
		System.setIn(new FileInputStream("src/input30522.txt"));
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[42];
		int cnt = 0;

		for (int i = 0; i < 10; i++) {
			arr[sc.nextInt() % 42] = true;
		}

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == true) {
//				cnt++;
//			}
//		}

		for (boolean value : arr) {
			if (value) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
