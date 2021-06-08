package Step2;

import java.util.Scanner;

public class baekjoon9498 {
	public static void main(String [] args) {
		// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		// 입력처리
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
	
		if (90 <= score && score <= 100) {
			System.out.println("A");
		} else if (80 <= score && score <= 89) {
			System.out.println("B");
		} else if (70 <= score && score <= 79) {
			System.out.println("C");
		} else if (60 <= score && score <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
