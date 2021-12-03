package method;

import java.util.Scanner;

public class Diet {

	public static double calculate(double weight, double tall) {
		double b = weight / (tall * tall);
		return b;
	}
	
	public static String result(double bmi) {
		String result = "";
		if (bmi >= 30) {
			result = "비만";
		}
		else if (bmi >= 25) {
			result = "과체중";
		}
		else if (bmi >= 18.5) {
			result = "정상";
		}
		else {
			result = "저체중";
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 대학생이 되어 열심히 다이어트 중인 나몸짱(20) 학생
		// 열심히 운동도 하고 식단 조절도 하고 있는데.. 과연 잘 하고 있는 걸 까?
		//체중(kg)과 키(m)를 입력받아 BMI지수를 반환하는 calculate()와 BMI 지수를 통해 비만도 결과를
		// 반환하는 result() 메소드를 완성하여, 출력 예와 같은 결과를 얻으시오.
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("몸무게(kg)을 입력해주세요 : ");
		double w = scanner.nextDouble();
		System.out.print("키(m)를 입력해주세요 : ");
		double t = scanner.nextDouble();
		scanner.close();
		
		double bmi = calculate(w, t);
		
		System.out.println("====================");
		System.out.printf("\nBMI : %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
		System.out.printf("결과 : %s입니다. \n", result(bmi));

	}

}
