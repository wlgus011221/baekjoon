package baekjoon;

import java.util.Scanner;

public class java_0104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int i = sc.nextInt();
		
		System.out.println(S.substring(i-1, i));
	}
}