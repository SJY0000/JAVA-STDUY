package reading_linebyline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation ="C:\\java502\\java\\JAVA-STUDY\\CH20_Reading_Writing\\test.txt";
		// 위의 파일 주소로 파일 객체 생성 메소드 exists는 파일이 있으면 true, 없으면 false로 return
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
//		BufferedReader reader = new BufferedReader(fileLocation); // 에러 생김
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){
			// 파일을 읽기위한 객체 생성
//			BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			// 파일 읽기
			String line = null;
			while ((line = reader.readLine()) !=null) { // 파일의 끝에 더이상 문자가 없으면 null값으로 while문 종료
				System.out.println(line); // 더이상 읽을 줄이 없을 때 까지 한 줄씩 읽어서 출력한다.
			}
		} catch (FileNotFoundException e) {
			// 실제 파일을 찾을 수 없을 경우
//			e.printStackTrace(); // 빨간색 예외처리
			System.out.println("파일을 찾지 못 했음 : " + fileLocation);
		} catch (IOException e) {
			// 파일을 읽지 못할 때
//			e.printStackTrace();
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}
	

	}

}
