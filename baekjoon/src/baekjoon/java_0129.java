package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_0129 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int count = N;
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			
			boolean[] check = new boolean[26];
			
			for(int j = 0; j < str.length(); j++) {
				if(check[str.charAt(j)-'a']==false) {
					check[str.charAt(j)-'a'] = true;
				} else if (j > 0 && str.charAt(j)!=str.charAt(j-1)) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
		br.close();
	}
}