package baekjoon;

import java.util.Scanner;

public class java_0110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String a = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<a.length(); i++) {
			sum += Integer.parseInt(a.substring(i, i+1));
		}
		System.out.println(sum);
	}
}