package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class java_0112 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					bw.write(S.charAt(j));
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}