package Step5;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2577 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input2577.txt"));
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String abc = Integer.toString(a * b * c);
		int cnt0 = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt5 = 0;
		int cnt6 = 0;
		int cnt7 = 0;
		int cnt8 = 0;
		int cnt9 = 0;

		// 배열만들기
		char[] arr = abc.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				cnt0++;
			} else if (arr[i] == '1') {
				cnt1++;
			} else if (arr[i] == '2') {
				cnt2++;
			} else if (arr[i] == '3') {
				cnt3++;
			} else if (arr[i] == '4') {
				cnt4++;
			} else if (arr[i] == '5') {
				cnt5++;
			} else if (arr[i] == '6') {
				cnt6++;
			} else if (arr[i] == '7') {
				cnt7++;
			} else if (arr[i] == '8') {
				cnt8++;
			} else {
				cnt9++;
			}
		}
		System.out.println(cnt0);
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
		System.out.println(cnt4);
		System.out.println(cnt5);
		System.out.println(cnt6);
		System.out.println(cnt7);
		System.out.println(cnt8);
		System.out.println(cnt9);
	}
}
