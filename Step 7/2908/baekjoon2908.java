package Step7;

import java.util.Scanner;

public class baekjoon2908 {
	public static void main(String[] args) {
//		두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오. 수를 거꾸로 읽음.
//		두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
	
		sb.append(sc.next());
		sb2.append(sc.next());
	
		sb.reverse();
		sb2.reverse();
		
		int a = Integer.parseInt(sb.toString());
		int b = Integer.parseInt(sb2.toString());
	
		if (a > b) {
			System.out.println(a);
		} else { 
			System.out.println(b);
		}
	}
}
