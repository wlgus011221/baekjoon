package baekjoon;

import java.util.Scanner;

public class java_0117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] arr_str = str.split("");
		
		int sec = 0;
		
		for(int i=0;i<arr_str.length;i++) {
		    if(arr_str[i].equals("A") || arr_str[i].equals("B") || arr_str[i].equals("C")) {
		    	sec += 3;
		    } else if(arr_str[i].equals("D") || arr_str[i].equals("E") || arr_str[i].equals("F")) {
		    	sec += 4;
		    } else if(arr_str[i].equals("G") || arr_str[i].equals("H") || arr_str[i].equals("I")) {
		    	sec += 5;
		    } else if(arr_str[i].equals("J") || arr_str[i].equals("K") || arr_str[i].equals("L")) {
		    	sec += 6;
		    } else if(arr_str[i].equals("M") || arr_str[i].equals("N") || arr_str[i].equals("O")) {
		    	sec += 7;
		    } else if(arr_str[i].equals("P") || arr_str[i].equals("Q") || arr_str[i].equals("R") || arr_str[i].equals("S")) {
		    	sec += 8;
		    } else if(arr_str[i].equals("T") || arr_str[i].equals("U") || arr_str[i].equals("V")) {
		    	sec += 9;
		    } else if(arr_str[i].equals("W") || arr_str[i].equals("X") || arr_str[i].equals("Y") || arr_str[i].equals("Z")) {
		    	sec += 10;
		    }
		}
		
		System.out.println(sec);
		
		sc.close();
	}
}