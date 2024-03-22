package baekjoon;

import java.util.Scanner;

public class java_0216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		int i = 1;
		int result = 0;
		
		while(i<=N) {
			if(N%i == 0) {
				count++;
			}
			if(count == K) {
				result = i;
				break;
			}
			i++;
		}
		System.out.println(result);
		sc.close();
	}
}