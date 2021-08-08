package RE;

import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Rebaekjoon3052 {
	public static void main(String[] args) throws Exception{
		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		System.setIn(new FileInputStream("src/input30522.txt"));
		Scanner sc = new Scanner(System.in);
		Set<Integer> results = new HashSet<Integer>();
		
		// 수 10개 입력
		for (int i = 0; i < 10; i++) {
			results.add(sc.nextInt() % 42);
		}
		
		System.out.println(results.size());
	}
}
