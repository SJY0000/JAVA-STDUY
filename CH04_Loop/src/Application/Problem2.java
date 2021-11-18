package Application;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// 7582초를 OO시간 OO분 OO초로 변환하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.print("초를 입력해주세요. : ");
		int totalSec = scanner.nextInt();
		scanner.close();
		
		
		int min = totalSec / 60;
		int hour = min / 60;
		min = min % 60;
		int sec = totalSec % 60;
		
		System.out.printf("시각은 %d시간 %d분 %d초 입니다.",hour, min, sec );
	

	}

}
