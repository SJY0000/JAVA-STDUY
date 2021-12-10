package java_api;

import java.util.ArrayList;

public class TotalChickenPrice {

	public static void main(String[] args) {
		/* CS호프는 아래와 같은 가격으로 다양한 치킨을 판매한다.
		* 후라이드 치킨 : 9900원, 로스트 치킨 9900원
		* 양념치킨 : 10900원, 간장치킨 : 10900원
		* 파닭치킨 : 12900원, 마늘아 치킨 : 13900원
		* 홍팍이는 로스트, 파닭, 마늘아 치킨을 주문하였다. 
		* 주어진 코드를 활용하여 홍팍이가 계산해야할 치킨의 총 합을 출력하시오.
		 */
		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		order.add(new Chicken("로스트 치킨", 9900));
		order.add(new Chicken("파닭 치킨", 12900));
		order.add(new Chicken("머눌어 차칸", 13900));
		
		int sum = 0;
		
		for (int i = 0; i < order.size(); i++) {
			sum += order.get(i).getPrice();
		}
		
		
		System.out.printf("총 합 : %d원\n", sum);
	}
}

class Chicken {
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
}
