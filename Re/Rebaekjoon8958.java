package RE;

import java.io.FileInputStream;
import java.util.Scanner;

public class Rebaekjoon8958 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input8958.txt"));
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		// 배열 만들기
		for (int i = 0; i < testCase; i++) {
			String problem = sc.next();
			char [] arr = problem.toCharArray();
			int cnt = 0;
			int sum = 0;
			
			// char 배열 안에서의 로직
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 'O') {
					cnt ++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			
			System.out.println(sum);
		}
	}
}
