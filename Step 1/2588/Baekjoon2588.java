package Step1;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2588 {
	public static void main(String[] args) {
		// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		// 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		// 472
		// 385
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		sc.nextLine(); // enter 값 빼줌.
		
		// 하나하나 쪼개기 위해 배열로 만듬
		String [] arr = sc.nextLine().split("");
		int[] num = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		
		int B = A * num[2];
		int C = A * num[1];
		int D = A * num[0];
		int E = B + (C * 10) + (D * 100);
		
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
	}
}
