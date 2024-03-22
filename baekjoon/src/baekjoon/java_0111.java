package baekjoon;

import java.util.Scanner;

public class java_0111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alpha = new int[26];
		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = -1;
		}
		
		String s = sc.next().toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alpha[(int)c - 97] == -1) {
                alpha[(int)c - 97] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }
	}
}