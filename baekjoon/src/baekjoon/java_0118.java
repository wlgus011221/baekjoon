package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class java_0118 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		while(count<100) {
			String str = br.readLine();
			
			if(str==null || str.equals("")) {
				break;
			}
			bw.write(str+"\n");
			
			count++;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}