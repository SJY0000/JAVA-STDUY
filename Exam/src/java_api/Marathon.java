package java_api;

import java.util.HashMap;

public class Marathon {

	public static void main(String[] args) {
		/*
		 * 수 많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다. 마라톤에 참여한
		 * 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못 한
		 * 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		 * 
		 * 제한사항 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다. Completion의 길이는 participant의
		 * 길이보다 1작습니다. 참가자 중에는 동명이인이 있을 수 있습니다.
		 */

		System.out.println(solution(new String[] { "병주", "병헌", "승언" }, new String[] { "병헌", "승언" }));
		System.out.println(solution(new String[] { "병주", "병헌", "승언", "송군" }, new String[] { "병주", "병헌", "승언" }));
		System.out.println(solution(new String[] { "병주", "병헌", "승언", "병헌" }, new String[] { "병주", "병헌", "승언" }));
	}

	private static String solution(String[] participant, String[] completion) {
		String answer = "";
		// HashMap hm을 생성한다. 참가자 이름과 함께 인원 수를 적을 수 있도록 자료형을 만든다.
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 참가자 배열에서 이름을 하나 씩 꺼내어 이름과 숫자 1을 HashMap에 추가한다.
		// 이 때 중복되는 이름은 중복되는 만큼 숫자를 더한다
		for (String name : participant) { 
			if(hm.get(name) == null) { // HashMap에 이름이 없다면
				hm.put(name, 1);		// 이름과 함께 1을 추가한다.
			}else {						// 이미 이름이 있다면
				int value = hm.get(name) + 1;		// HashMap의 그 이름에 해당하는 값을 가져와 +1 한다.
				hm.put(name, value);// 이름이 중복될 경우 업데이트
			}
		}
		
//		for (String name : completion) {
//			// 마라톤 완주자 이름은 HashMap에서 -1 해준다.
//			 hm.values() -= 1;			
//			
//		}
		
		for (String name : hm.keySet()) { // HahMap 요소를 전체 반복
			if (hm.get(hm.values()) == 1) answer = name; // 이름에 해당하는 값이 1이면 리턴한다.
		}
		return answer;
	} 
	
}
