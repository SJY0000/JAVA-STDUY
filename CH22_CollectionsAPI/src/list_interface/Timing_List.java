package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {

	public static void main(String[] args) {
		// ArrayList 와 LinkedList의 실행시간
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long duration = timeOperations(linkedList);
		System.out.println("측정시간 : " + duration);
		// 일반적으로 순서대로 입력은 ArrayList가 더 빠름
		// 특정 인덱스 번호에 수정 및 제거는 LinkedList가 훨씬 빠름
		
		//		// 시간체크 하는 법
//		long time1 = System.currentTimeMillis(); // 현재 시간을 1 / 1000초로 return
//		System.out.println(time1);
//		
//		// List 실행하고
//		for(int i = 0; i < 10000; i++) {
//			System.out.println(i);
//		}
//		long time2 = System.currentTimeMillis(); // 현재 시간을 1 / 1000초로 return
//		System.out.println(time2 - time1); // for문이 실행되는데 걸린 시간

	}
	
	public static long timeOperations(List<Integer> list) {
		long start = System.currentTimeMillis(); // 시간측정
		
		for(int i = 0; i < 100000; i++) {
			list.add(0, i); // 0부터 10만-1까지 리스트에 하나씩 입력
			// 인덱스 번호 0번에 0부터 10만-1 까지 입력
		}
		
		return System.currentTimeMillis() - start;	// 실행시간 return
		}

}
