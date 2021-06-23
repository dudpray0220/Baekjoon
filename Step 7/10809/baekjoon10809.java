package Step7;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon10809 {
	public static void main(String[] args) {
//		알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
//		각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다. 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력
		// 입력처리
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] question = s.toCharArray(); // 주어진 문자열을 비교가 용이하도록 char 배열로 바꿈

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] arr = alphabet.toCharArray(); // 알파벳 배열생성
		int[] answer = new int[arr.length]; // 몇 번째인지 출력할 정답 배열 생성

		// 로직구현
		for (int i = 0; i < arr.length; i++) { // a ~ z
			for (int j = 0; j < question.length; j++) { // b ~ n
				if (arr[i] == question[j]) {
					answer[i] = j;
					break;
				} else {
					answer[i] = -1;
				}
			}
		}

		// 출력 구현
		for (int i = 0; i < answer.length; i++) {
			if (i == answer.length - 1) {
				System.out.print(answer[i]);
			} else {
				System.out.print(answer[i] + " ");
			}
		}
	}
}
