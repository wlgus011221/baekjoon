package baekjoon;

import java.util.Scanner;

public class java_0202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] a = new char[5][15];
		
		for(int i = 0; i < 5; i++) {
			String str = sc.next();
			for(int j = 0; j < str.length(); j++) {
				a[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(a[j][i] != '\0') {
					System.out.print(a[j][i]);
				}
			}
		}
		
		sc.close();
	}
}