package baekjoon;

import java.util.Scanner;

public class java_0125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alpha = new int[26];
		
		String word = sc.next();
		word = word.toLowerCase();
		
		for(int i=0; i<word.length(); i++) {
			if('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
				alpha[word.charAt(i)-'a']++;
			}
		}
		int max = -1;
		char ch='?';
		
		for (int i = 0; i < 26; i++) {
			if (alpha[i] > max) {
				max = alpha[i];
				ch = (char) (i + 65);
			}
			else if (alpha[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		sc.close();
	}
}