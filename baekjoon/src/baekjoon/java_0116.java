package baekjoon;

import java.util.Scanner;

public class java_0116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		
		StringBuffer a = new StringBuffer(A);
		String rev_a = a.reverse().toString();
		
		StringBuffer b = new StringBuffer(B);
		String rev_b = b.reverse().toString();
		
		if(Integer.parseInt(rev_a) > Integer.parseInt(rev_b)) {
			System.out.println(rev_a);
		} else {
			System.out.println(rev_b);
		}
		
		sc.close();
	}
}