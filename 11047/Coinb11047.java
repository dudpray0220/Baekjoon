package Challenge;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Coinb11047 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input11047.txt"));
		Scanner sc = new Scanner(System.in);
		int coinNums = sc.nextInt();
		int price = sc.nextInt();
		int solution = 0;
		int [] arr = new int [coinNums];
		
		// 배열선언
		for (int i = 0; i < coinNums; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 로직구현
		for (int i = coinNums-1; i >= 0; i--) {	// 뒤에서부터 차례차례 price와 비교!
			if(price >= arr[i]) {
				solution += price / arr[i];
				price = price % arr[i];
			}
		}
		System.out.println(solution);
	}
}
