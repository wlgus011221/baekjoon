package baekjoon;

import java.util.Scanner;

public class java_0124 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		int palindrome = 0;
	
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length()-i-1)) {
				palindrome = 1;
			} else {
				palindrome = 0;
				break;
			}
		}
		
		System.out.println(palindrome);
		
		sc.close();
	}
}