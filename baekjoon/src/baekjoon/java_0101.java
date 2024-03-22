package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class java_0101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[10];
		int[] B = new int[10];
		
		for (int i = 0; i < 10; i++) {
			A[i] = sc.nextInt();
			B[i] = A[i] % 42;
		}
		
		int[] count = Arrays.stream(B).distinct().toArray();
		System.out.println(count.length);
	}
}