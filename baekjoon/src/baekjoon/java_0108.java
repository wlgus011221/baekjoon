package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class java_0108 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		
		
		for(int i=0; i<T; i++) {
			String S = sc.next().toUpperCase();
	
			bw.write(S.charAt(0));
			bw.write(S.charAt(S.length()-1) + "\n");
			
		}
		bw.flush();
		bw.close();
		sc.close();
	}
}