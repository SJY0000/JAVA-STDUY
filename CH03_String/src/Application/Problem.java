package Application;

import java.util.Scanner;

import org.w3c.dom.css.CSSImportRule;

public class Problem {

	public static void main(String[] args) {
		// 꿈꾸는 김바리 학생 이번 달부터 별다방에서 일하기로 했다.
		// 월급은 기본시급 8000원에 일한시간을 곱한 값으로 한다.
		// 기본 시급과 일한 시간을 입력으로 받아 출력 예와 같은 결과를 얻으시오.

		
		Scanner scan = new Scanner(System.in);
		System.out.print("일한 시간을 입력해주세요 : ");
		int workingtime = scan.nextInt();
		int monthmoney = (8000 * workingtime);
		
		System.out.println("월급은 : " + monthmoney + "원");
		scan.close();
	}

}
