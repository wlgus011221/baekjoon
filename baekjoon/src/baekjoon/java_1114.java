package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class java_1114 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try{
        	StringTokenizer st;
        	while(true) {
        		String line = br.readLine();
    			// if(line == null) {//이클립스에서 작동하지 않음
    			if (line == null || line.equals("")) {
    				break;
    			}
    			st = new StringTokenizer(line);
    			int a = Integer.parseInt(st.nextToken());
    			int b = Integer.parseInt(st.nextToken());
    			bw.write(a + b + "\n");
            }
        	br.close();
        	bw.flush();
        	bw.close();
        } catch (IOException e) {
        	System.out.println("오류 발생");
        }
	}
}
