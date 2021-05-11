package Challenge;

import java.util.Scanner;
// for문
public class Coinb14916 {
	public static void main(String[] args) {
		// 입력처리
		Scanner sc = new Scanner(System.in);
		int coinNums;
		int changes;

		// 로직구현
		for (int i = 0; i < 999999; i++) {
			System.out.println("거스름돈을 입력하세요 (1 ~ 100,000)");
			changes = sc.nextInt();
			coinNums = 0;

			if (changes % 5 == 0) { // 5로 나누어 떨어질 때
				coinNums = changes / 5;
			} else { 				// 문제서 14원, 13원, 못 거슬러줄때 로직 (-5보다는 -2가 맞다. 왜냐하면 -5를 하면 4일때 오류)
				
				for (int j = 0; j < 999999; j++) {	// while(true)로도 무한반복문 가능
					
					if (changes < 0) {
						coinNums = -1;
						break;
					}
					
					if (changes == 0) {	// if 문은 여러개 써도 됨.
						coinNums = 0;
						break;
					}

					changes -= 2;
					coinNums++;

					if (changes % 5 == 0) {
						coinNums = coinNums + (changes / 5);
						break;
					}
				}
			}
			System.out.println(coinNums);
		}
	}
}

// 백준 제출용
//package Challenge;
//
//import java.util.Scanner;
//public class Coinb14916 {
//	public static void main(String[] args) {
//		// 입력처리
//		Scanner sc = new Scanner(System.in);
//		int changes = sc.nextInt();
//		int coinNums = 0;
//
//		// 로직구현
//		if (changes % 5 == 0) {
//			coinNums = changes / 5;
//		} else {
//			while (true) {
//
//				if (changes < 0) {
//					coinNums = -1;
//					break;
//				}
//
//				if (changes == 0) {
//					coinNums = 0;
//					break;
//				}
//
//				changes -= 2;	// changes = changes - 2
//				coinNums++;
//
//				if (changes % 5 == 0) {
//					coinNums += changes / 5;
//					break;
//				}
//			}
//		}
//		System.out.println(coinNums);
//	}
//}