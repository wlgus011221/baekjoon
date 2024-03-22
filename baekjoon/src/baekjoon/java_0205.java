package baekjoon;

import java.util.Scanner;

public class java_0205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] a = new int [101][101];
		int area = 0;
		
		for(int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					a[x+j][y+k] = 1;
				}
			}
		}
		
		for(int l = 0; l < 101; l++) {
			for(int n = 0; n <101; n++) {
				if(a[l][n] == 1) {
					area += 1;
				}
			}
		}
		System.out.println(area);
		
		sc.close();
	}
}