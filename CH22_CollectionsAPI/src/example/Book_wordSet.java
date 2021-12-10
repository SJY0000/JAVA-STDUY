package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {
	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 list에 넣기
		// 이 때 list는 단어가 중복되지 않는다. 알파벳 순으로 저장 => TreeSet
		File dracula = new File("dracula.txt"); 
		File huk = new File("huk.txt"); 
		//C:\Users\admin\Desktop\t\JAVA-STUDY\CH22_CollectionsAPI\dracula.txt
		
		System.out.println(dracula.exists()); // 파일이 있는지 확인
		System.out.println(huk.exists()); // 파일이 있는지 확인
		
		TreeSet<String> dralist = loadWords(dracula);
		TreeSet<String> huks = loadWords(huk);
		
		System.out.println(dralist.size());
		System.out.println(huks.size());
		
//		for (String w : dralist) {
//			System.out.println(w);
//		}
		displayWords(dralist);
	}
	
	private static void displayWords(TreeSet<String> list) {
		// 트리셋을 입력받아 그 안에 단어들을 출력한다
		int count = 0;
		for (String w : list) {
			System.out.printf("%-10s \t", w);
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}
	/**
	 * 입력된 파일을 읽어서 단어를 마지막에 TreeSet list로 return
	 * @param dracula
	 * @return
	 */
	private static TreeSet<String> loadWords(File dracula) {
		TreeSet<String> wordSet = new TreeSet<>();
		
		//파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(dracula))){
			String line = null; 
			// 한줄 읽기
			while ((line = reader.readLine()) !=null) { // 파일의 끝에 더이상 문자가 없으면 null값으로 while문 종료
				String[] words = line.split("[^a-zA-Z]"); // 정규표현식, 영문철자를 제외한 특수문자 스페이스 점 슬래시 같은 것들을 제외하고 단어만 리턴
															// [] 정규표현식 시작, ^뒤에나오는 것들을 제외한다
				// TreeSet에 단어로 분리해서 입력한다.(자동 정렬 및 중복제거)
				for (String w : words) {
					if (w.length() < 6) {
						continue;
					}
					wordSet.add(w.toLowerCase()); // 소문자로 단어 입력
				}
			}
		} catch (FileNotFoundException e) {
			// 실제 파일을 찾을 수 없을 경우
//			e.printStackTrace(); // 빨간색 예외처리
			System.out.println("파일을 찾지 못 했음 : ");
		} catch (IOException e) {
			// 파일을 읽지 못할 때
//			e.printStackTrace();
			System.out.println("파일을 읽지 못함 : ");
		}
		return wordSet;
	}
}
