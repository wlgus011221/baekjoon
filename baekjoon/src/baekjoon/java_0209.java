package baekjoon;

import java.util.Scanner;

public class java_0209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dot = (int)Math.pow(2, n) + 1;
		System.out.println(dot*dot);
		sc.close();
	}
}