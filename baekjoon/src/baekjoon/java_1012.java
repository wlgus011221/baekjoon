package baekjoon;

import java.util.Scanner;

public class java_1012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		
		int[] a = new int[N];
		int[] b = new int[N];
		int total = 0;
		for(int i=0; i < N; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			total += a[i] * b[i];
		}
		
		if(X==total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}