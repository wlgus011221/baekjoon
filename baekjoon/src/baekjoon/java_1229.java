package baekjoon;

import java.util.Scanner;

public class java_1229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stu[] = new int[30];
		
		for (int i=0; i < 28; i++) {
			int n = sc.nextInt();
			stu[n-1] = 1;
		}
		
		for (int i=0; i<30; i++) {
			if(stu[i] == 0) {
				System.out.println(i+1);
			}
		}
	}
}