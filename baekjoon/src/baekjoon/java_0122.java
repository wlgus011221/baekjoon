package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class java_0122 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int K = 1;	// 킹의 개수
		int Q = 1;	// 퀸의 개수
		int R = 2;	// 룩의 개수
		int B = 2;	// 비숍의 개수
		int N = 2;	// 나이트의 개수
		int P = 8;	// 폰의 개수
		
		int king = sc.nextInt();	// 킹의 개수
		int queen = sc.nextInt();	// 퀸의 개수
		int rook = sc.nextInt();	// 룩의 개수
		int bishop = sc.nextInt();	// 비숍의 개수
		int knight = sc.nextInt();	// 나이트의 개수
		int pawn = sc.nextInt();	// 폰의 개수
		
		bw.write(K - king + " ");
		bw.write(Q - queen + " ");
		bw.write(R - rook + " ");
		bw.write(B - bishop + " ");
		bw.write(N - knight + " ");
		bw.write(P - pawn + " ");
		
		bw.flush();
		bw.close();
		sc.close();
	}
}