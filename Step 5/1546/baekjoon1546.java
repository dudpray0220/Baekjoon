package Step5;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1546 {
	public static void main(String[] args) throws Exception {
		// 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		// 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
		System.setIn(new FileInputStream("src/input1546.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 과목의 개수
		double [] arr = new double [n];
		double total = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);
		
		for (int i = 0; i<n; i++) {
			arr[i] = (arr[i]/arr[n-1]) * 100;
			total += arr[i];
		}
		System.out.println(total/arr.length);
	}
}
