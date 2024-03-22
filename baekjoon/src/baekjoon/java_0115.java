package baekjoon;

import java.util.Scanner;

public class java_0115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] word = str.split(" ");
		
		if(word.length==0) {
			System.out.println(0);
			System.exit(0);
		}
		
		if(word[0]=="") {
			System.out.println(word.length-1);
		}else {
			System.out.println(word.length);
		}
		
		sc.close();
	}
}