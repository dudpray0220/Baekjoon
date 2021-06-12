package Step5;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon4344 {
	public static void main(String[] args) throws Exception {
		// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		System.setIn(new FileInputStream("src/input4344.txt"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int num = sc.nextInt();
			int sum = 0;
			double cnt = 0;
			double[] arr = new double[num];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextDouble();
				sum += arr[j];
			}

			double avg = sum / arr.length;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > avg) {
					cnt++;
				}
			}
			double answser = (cnt/arr.length) * 100;
			
			System.out.print(String.format("%.3f", answser));
			System.out.print("%");
			System.out.println();
		}
	}
}
