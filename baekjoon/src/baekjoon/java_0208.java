package baekjoon;

import java.util.Scanner;

public class java_0208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] C = new int[N];
		
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0;
			
			quarter = C[i] / 25;
			C[i] %= 25;
			dime = C[i] / 10;
			C[i] %= 10;
			nickel = C[i] / 5;
			C[i] %= 5;
			penny = C[i];
			
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
		
		sc.close();
	}
}