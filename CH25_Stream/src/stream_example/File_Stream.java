package stream_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_Stream {

	public static void main(String[] args) throws IOException {
		// FileStream, 경로는 문자열로 표시
		Path path = Paths.get("C:\\java502\\java\\JAVA-STUDY\\CH22_CollectionsAPI\\dracula.txt");
		
		// lines()로 파일의 모든 줄을 읽고 forEach로 한 줄씩 출력
		Files.lines(path).forEach(s -> System.out.println(s)); 

	}

}
