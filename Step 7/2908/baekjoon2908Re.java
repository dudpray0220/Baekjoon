package Step7;

import java.util.Scanner;

public class baekjoon2908Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
	
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
