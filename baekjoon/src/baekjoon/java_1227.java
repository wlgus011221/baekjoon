package baekjoon;

import java.util.Scanner;

public class java_1227 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 바구니 개수
		int M = sc.nextInt(); // 공을 넣을 횟수
		
		int[] a = new int[N+1];
		
		for (int n = 0; n < M; n++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for (int u=i; u<=j; u++) {
				a[u] = k;
			}
		}
		
		for (int i=1; i <= N; i++) {
			System.out.print(a[i] + " ");
		}
	}
}