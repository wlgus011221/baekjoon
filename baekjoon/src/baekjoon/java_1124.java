package baekjoon;

import java.util.Scanner;

public class java_1124 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for (int i=0; i<N; i++) {
			int num = sc.nextInt();
			a[i] = num;
		}
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1; i<N ;i++) {
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min+ " "+ max);
	}
}