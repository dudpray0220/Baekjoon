package Step2;

import java.util.Scanner;

public class baekjoon2753 {
	public static void main(String [] args) {
		// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.println(1);
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
