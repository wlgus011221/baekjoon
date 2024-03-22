package baekjoon;

import java.util.Scanner;

public class java_0922 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.println(A * (B%100%10));
		System.out.println(A * (B%100/10));
		System.out.println(A * (B/100));
		System.out.println(A*B);
	}
}