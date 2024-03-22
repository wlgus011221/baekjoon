package baekjoon;

import java.util.Scanner;

public class java_1010 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		
		int[] a;
		a = new int[count];
		
		int[] b;
		b = new int[count];
		
		for(int i = 0; i < count; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		
		for(int i = 0; i<count; i++) {
			System.out.println(a[i]+b[i]);
		}
	}
}