package method;

import java.util.Scanner;

public class ProgramingGrades {

	
	public static String grade(int score) {
		String g = "";
		if (score >= 95) {
			g ="A+";
		}
		else if (score >= 90) {
			g="A0";
		}
		else if (score >= 80) {
			g="B+";
		}
		else if (score >= 70) {
			g="B0";
		}
		else {
			g="C+";
		}
		return g;
	}
	
	public static void main(String[] args) {
		// 주어진 성적 변수에 대한 학점을 반환하는 메소드 grade()를 완성하여
		// 출력 예 와 같은 결과를 얻으시오.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 점수는 = ");
		int score1 = scanner.nextInt();
		System.out.print("두번째 점수는 = ");
		int score2 = scanner.nextInt();
		System.out.print("세번째 점수는 = ");
		int score3 = scanner.nextInt();
		scanner.close();
		
		System.out.printf("%d점 -> %s\n", score1, grade(score1));
		System.out.printf("%d점 -> %s\n", score2, grade(score2));
		System.out.printf("%d점 -> %s\n", score3, grade(score3));

	}

}
