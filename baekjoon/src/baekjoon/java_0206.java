package baekjoon;

import java.util.Scanner;

public class java_0206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		int N = sc.nextInt();
		int tmp = 1;
		int result = 0;
		
		for(int i = num.length()-1; i >= 0; i--) {
			char b = num.charAt(i);
			
			if('A' <= b && b <= 'Z') {
				result += (b-'A'+10) * tmp;
			} else {
				result += (b-'0') * tmp;
			}
			tmp *= N;
		}
		System.out.println(result);
		sc.close();
	}
}