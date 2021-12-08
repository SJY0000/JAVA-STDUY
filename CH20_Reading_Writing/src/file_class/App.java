package file_class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// 파일 객체를 만들기
		File currentDirectory = new File("."); // 현재 프로젝트 폴더 안에 있는 파일 // .은 폴더를 의미
		
		System.out.println(currentDirectory.getAbsolutePath()); // 파일 객체의 절대경로 출력 // 프로젝트 폴더 경로
		System.out.println(currentDirectory.getCanonicalPath()); // 프로젝트폴더의 절대경로까지만 출력 // 파일 이름 지정시 파일까지 표시

		// 폴더 내부 파일들을 출력
		for(String f : currentDirectory.list()) {
			System.out.println(f); // 프로젝트 폴더 안에 있는 모든 폴더 및 파일 출력
		}
	}

}
