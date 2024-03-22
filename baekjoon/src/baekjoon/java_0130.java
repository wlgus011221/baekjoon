package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_0130 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double sumScorexGrade = 0;
		double sumScore = 0;
		
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			String object = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if(!(grade.equals("P"))) {
				switch(grade) {
					case "A+":
						sumScorexGrade += (score * 4.5);
						break;
					case "A0":
						sumScorexGrade += (score * 4.0);
						break;
					case "B+":
						sumScorexGrade += (score * 3.5);
						break;
					case "B0":
						sumScorexGrade += (score * 3.0);
						break;
					case "C+":
						sumScorexGrade += (score * 2.5);
						break;
					case "C0":
						sumScorexGrade += (score * 2.0);
						break;
					case "D+":
						sumScorexGrade += (score * 1.5);
						break;
					case "D0":
						sumScorexGrade += (score * 1.0);
						break;
					case "F":
						sumScorexGrade += (score * 0.0);
						break;
					default:
						break;
				}
				sumScore += score;
			}
		}
		
		System.out.printf("%.6f", sumScorexGrade/sumScore);
		br.close();
	}
}