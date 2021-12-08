package reading_writing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// 텍스트 읽고 쓰기
		String text = "헬로우! \n 하 와 유?"; // 적을 내용
				
		// 특수 문자 일경우 두번 적어서 헷갈리지 않게 해 줌  
		Path path = Paths.get("C:\\java502\\java\\new.txt"); // 파일의 경로 // 현재 프로젝트 폴더, 상대경로

//				Path path = Paths.get("text.txt"); // 파일의 경로 // 현재 프로젝트 폴더, 상대경로
					//path = C:\java502\java\JAVA-STUDY\CH20_Reading_Writing\text.txt를 의미함
		
		// text.txt에 위의 text내용을 적기
		// Files 클래스의 static 메소드 write로 (적을 파일의 경로, 적을 내용(byte단위))
		Files.write(path, text.getBytes()); // 파일이 없을 경우 만듬
		
		// 읽기
		String recievedText = Files.readString(path);
		System.out.println(recievedText);
		
		
		}
}