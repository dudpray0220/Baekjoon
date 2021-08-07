package RE;

import java.io.FileInputStream;
import java.util.Scanner;

import Basic.scannerPractice;

public class Re2baekjoon2577 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input2577.txt"));
		// 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에
		// 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		// 입력처리
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = a * b * c; // 17037300
		
		// 배열 만들어서 한 줄 씩 출력
		int [] results = new int [10]; // 0 ~ 9까지 이므로 10개
		
		// 배열에 원소 넣기
		// 일의 자리 % 10, 십의 자리 / 10
		while (x != 0) {
			results[x % 10]++;
			x = x / 10;
		}
		
		// 결과 출력
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
}
