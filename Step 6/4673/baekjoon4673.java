package Step6;

public class baekjoon4673 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		for (int i = 1; i < 10001; i++) {
			int n = d(i); // 33
			if (n < 10001) { // 10000까지만 넣어줌.
				arr[n] = true;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i]) { // false인 인덱스만 출력 (즉, 생성자가 없는 셀프넘버)
				System.out.println(i);
			}
		}
	}

	public static int d(int number) {
		int sum = number; // 33
		while (number != 0) {
			sum += number % 10; // + 3 + 3
			number = number / 10; // 33 -> 3 -> 0
		}
		return sum;
	}
}
