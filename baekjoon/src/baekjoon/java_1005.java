package baekjoon;

import java.util.Scanner;

public class java_1005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (b + c >= 60) {
			a = a + ((b+c)/60);
			b = (b + c) % 60;
			if (a >= 24) {
				a = a - 24;
			}
		} else {
			b = b + c;
		}
		System.out.println(a + " " + b);
	}
}