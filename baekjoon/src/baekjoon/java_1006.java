package baekjoon;

import java.util.Scanner;

public class java_1006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if ((a == b) && (a == c)) { // a,b,c 같은 경우
			System.out.println(10000 + a * 1000); 
		} else if ((a == b) && (a != c)) { // a,b 같은 경우
			System.out.println(1000 + a * 100); 
		} else if ((a != b) && (a == c)) { // a,c 같은 경우
			System.out.println(1000 + a * 100);
		} else if ((a != b) && (a != c) && (b == c)) { // b,c 같은 경우
			System.out.println(1000 + b * 100);
		} else if ((a != b) && (a != c) && (b != c)){ // 다 다른 경우
			if((a < b) && (b > c)) {
				System.out.println(b * 100);
			} else if ((a < c) && (c > b)) {
				System.out.println(c * 100);
			} else {
				System.out.println(a *100);
			}
		}
	}
}