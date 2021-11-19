package application;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열을 생성한다.
		// int[] n = {1,2,3}; 초기값을 바로 넣는 법, 리터럴이라고 한다.
		int[] numbers;		// 정수형 배열 numbers 선언
		numbers = new int[3]; // 정수형 배열위치를 3개 만듬, 정수형이라서 초기값 0으로 되어있음
		
		numbers[0] = 99;
		numbers[1] = 999;
		numbers[2] = 9999;
		
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			total = total + numbers[i]; // 모든 배열의 값을 더함
		}
		
		System.out.println("총 합계는 : " + total);
		

	}

}
