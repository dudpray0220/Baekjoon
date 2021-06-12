package Step5;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon8958 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input8958.txt"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		// 배열만들기
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			int cnt = 0;
			int sum = 0;
			
			char [] arr = sc.nextLine().toCharArray();
			//System.out.println(Arrays.toString(arr));
		
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 'O') {
					cnt++; // 1 2 1 1 2 3
				} else {
					cnt = 0;
				}
				sum += cnt; // 1 3 4 5 7 10
			}
			System.out.println(sum);
		}
	}
}
