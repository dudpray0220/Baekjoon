package Step7;

import java.util.Scanner;

public class baekjoon11654 {
	public static void main (String[] args) throws Exception {
		// System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장할 수 있다.
		// 그리고 반드시 주의해야 할 점은 예외처리를 해주어야한다.IOException (java.io 패키지를 import 해야함) 로 메인 옆에 써주어도 되고, 그냥 Exception 으로 처리해도 된다.
		
		// [입력] String 으로 입력받는다.
		// -> [charAt()] String 에서 char 로, 즉 문자열을 잘라 문자로 변환한다.
		// -> int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.
		
//		int a = System.in.read();
//		System.out.print(a);
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextLine().charAt(0);
		System.out.println(a);
	}
}
