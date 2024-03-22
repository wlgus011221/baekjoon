package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class java_0207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int N = sc.nextInt();
		
		ArrayList<Character> list = new ArrayList<>();
		
		while(num>0) {
			if(num % N < 10) {
				list.add((char)(num % N + '0'));
			} else {
				list.add((char)(num % N - 10 + 'A'));
			}
			num /= N;
		}
		
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
		sc.close();
	}
}