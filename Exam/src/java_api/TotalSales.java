package java_api;

import java.util.ArrayList;

class Store {
	private ArrayList<Menu> list;
	
	public Store() {
		this.list = new ArrayList<>();
	}
	
	public void add(Menu menu) {
		list.add(menu);
	}
	
	public int totalSales() {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getPrice() * list.get(i).getcount();
		}
		return sum;
	}
}

class Menu {
	private String name;
	private int price;
	private int count;
	
	public Menu(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getcount() {
		return count;
	}
	
	
}

public class TotalSales {

	public static void main(String[] args) {
		// 홍팍이네 분식집의 오늘 하루 매출은 아래와 같다.
		// 김밥(2000원) * 57개
		// 돈까스(6000원) * 29개
		// 냉면(5000원) * 34개
		// 주어진 코드를 활용하여 출력 예와 같은 결과를 얻는 프로그램을 작성하시오.
		ArrayList<Menu> m = new ArrayList<>();
		
		m.add(new Menu("김밥", 2000, 57));
		m.add(new Menu("돈까스", 6000, 29));
		m.add(new Menu("냉면", 5000, 34));
		
		Store s = new Store();
		
		for (int i = 0; i < m.size(); i++) {
			s.add(m.get(i));
		}
		
		System.out.printf("총 매출 : %d원", s.totalSales());
		
		
		
		

	}

}
