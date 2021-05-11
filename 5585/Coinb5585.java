package Challenge;

import java.util.Scanner;

public class Coinb5585 {
	public static void main(String[] args) {
		// 입력처리
		Scanner sc = new Scanner(System.in);
		int[] arr = { 500, 100, 50, 10, 5, 1 };
		int coinNums = 0;
		System.out.println("1000원 미만 물건가격을 입력하세요");
		int price = sc.nextInt();
		int changes = 1000 - price;

		// 로직구현
		for (int i = 0; i < arr.length; i++) {
			if (changes >= arr[i]) {
				coinNums += changes / arr[i];
				changes = changes % arr[i];
			}
		}
		System.out.println(coinNums);
	}
}
