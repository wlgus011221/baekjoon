package baekjoon;

import java.util.Scanner;

public class java_1122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i=0; i<N; i++) {
			int num = sc.nextInt();
			a[i] = num;
		}
		int b = sc.nextInt();
		
		int count=0;
		for(int i=0; i<N ;i++) {
			if(a[i]==b)
				count++;
		}
		System.out.println(count);
	}
}