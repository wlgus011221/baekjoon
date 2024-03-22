package baekjoon;

import java.util.Scanner;

public class java_1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = i + 1;
		}
		
		for (int n = 0; n < M; n++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
		for (int i=0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
	}
}