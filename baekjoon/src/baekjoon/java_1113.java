package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class java_1113 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a, b;
        try{
        	while(true) {
        		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        		a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                
                if(a==0 && b==0) {
                	break;
                }
                else {
                	bw.write((a+b) + "\n");
                }
            }
        	bw.flush();
        	bw.close();
        } catch (IOException e) {
        	System.out.println("오류 발생");
        }
	}
}
