package Step7;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1157 {
	public static void main(String[] args) {
		// 입력처리
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); // 입력 문자열
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		// 소, 대문자 알파벳 배열 만들기
		char[] smallArr = alphabet.toCharArray();
		char[] bigArr = alphabet.toUpperCase().toCharArray();
		int[] answer = new int[smallArr.length]; // 정답 추출위한 배열

		// 로직 구현
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < smallArr.length; j++) {
				if (s.charAt(i) == smallArr[j]) { // 소문자 담기
					answer[j]++;
				} else if (s.charAt(i) == bigArr[j]) { // 대문자 담기
					answer[j]++;
				}
			}
		}
		
		// 최다사용한 알파벳 인덱스를 구하는 로직
		int max = answer[0];
		int maxIndex = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] > max) {
				max = answer[i];
				maxIndex = i;
			}
		}

		// 최다사용이 2개 이상일 때
		Arrays.sort(answer);
		if (answer[answer.length-1] == answer[answer.length-2]) {
			System.out.println("?");
		} else {
			System.out.println(bigArr[maxIndex]);
		}
	}
}
