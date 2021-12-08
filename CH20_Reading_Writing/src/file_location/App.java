package file_location;

import java.io.File;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation ="C:\\java502\\java\\JAVA-STUDY\\CH20_Reading_Writing\\test.txt";
		// 위의 파일 주소로 파일 객체 생성 메소드 exists는 파일이 있으면 true, 없으면 false로 return
		System.out.println(new File(fileLocation).exists());

	}

}
