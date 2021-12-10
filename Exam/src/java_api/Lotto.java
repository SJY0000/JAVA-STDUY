package java_api;

import java.util.Random;

class LottoMachine {
	private int[] LottoNumbers;
	
	public LottoMachine() {
		LottoNumbers = generate();
	}
	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			pickedNumbers[i] = rand.nextInt(46);
		}
		return pickedNumbers;
	}
	public int[] getLottoNumbers() {
		return LottoNumbers;
	}
}

public class Lotto {

	public static void main(String[] args) {
		// 로또는 1 ~ 45 사이의 정수 중 중복되지 않는 6개의 숫자를 정하여 이를 맞추면 상금을 타게된다.
		// 출력 예와 같이 6개의 로또 번호를 자동 생성하도록 주어진 코드를 완성하시오.
		
//		Random gen = new Random();
//		int num1;
//		
//		num1 = gen.nextInt(46);
//		System.out.println(num1);
		LottoMachine machine = new LottoMachine();
		
		int[] numbers = machine.getLottoNumbers();
		
		System.out.print("생성 번호 : ");
		for (int i : numbers) {
			System.out.printf("%d ", i);
		}
		

	}
}


