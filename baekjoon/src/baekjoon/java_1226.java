package baekjoon;

import java.util.Scanner;

public class java_1226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		
		for (int i=0; i<9; i++) {
			int num = sc.nextInt();
			a[i] = num;
		}
		
		int max = a[0];
		int n = 1;
		
		for(int i=1; i<9; i++) {
			if(max < a[i]) {
				max = a[i];
				n = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(n);
	}
}