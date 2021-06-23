package Step7;

import java.util.Scanner;

public class baekjoon11720 {
	public static void main(String[] args) throws Exception {
		// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		// 입력으로 주어진 숫자 N개의 합을 출력한다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String numbers = sc.next();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += numbers.charAt(i)-48;
		}
	
		System.out.println(sum);
	}
}
