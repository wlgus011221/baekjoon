package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class java_0215 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
        while(true){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	if(a==0 && b==0) {
        		break;
        	} 
        	
        	if(a>b) {
        		if(a%b==0) {
        			bw.write("multiple");
        		} else {
        			bw.write("neither");
        		}
        	} else {
        		if(b%a==0) {
        			bw.write("factor");
        		} else {
        			bw.write("neither");
        		}
        	}
        	bw.write("\n");
        }
        bw.flush();
        bw.close();
        sc.close();
	}
}