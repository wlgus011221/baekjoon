package baekjoon;

import java.util.Scanner;

public class java_0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int [9][9];
		int max = 0;
		int x = 1;
		int y = 1;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
					x = i + 1;
					y = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}