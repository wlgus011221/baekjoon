package baekjoon;

import java.util.Scanner;

public class java_1004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if (M < 45) {
			H = H - 1;
			if (H < 0) {
				H = 23;
			}
			M = 60 + (M - 45);
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M-45));
		}
	}
}

/* 왜 틀렸을까....
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if (M - 45 < 0) {  <---- 이런 식으로 하면 안 되는건가???
			H = H - 1;
			M = 60 + (M - 45);
			if (H - 1 < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M-45));
		}
	}
}
*/