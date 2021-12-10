package java_api;

import java.text.NumberFormat;
import java.util.ArrayList;

class Cart {
	private ArrayList<Item> list;
	
	public Cart() {
		this.list = new ArrayList<Item>();
	}
	
	public void add(Item item) {
		list.add(item);
	}
	public int totalPrice() {
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getPrice();
		}

		return sum;
	}
}

class Item {
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

public class TotalPrice {

	public static void main(String[] args) {
		// 홍팍이는 아래의 제품들을 장바구니에 담고, 이들의 총합을 확인하려한다.
		// 스트라이프 셔츠(49,900원), 슬림 면바지(58,900원), 스니커즈(46,900원)
		// 주어진 코드를 활용하여 장바구니 내역의 총합을 구하는 프로그램을 완성하시오.
		ArrayList<Item> it = new ArrayList<>();
		
		it.add(new Item("스트라이프 셔츠", 49900));
		it.add(new Item("슬림 면바지", 58900));
		it.add(new Item("스니커즈", 46900));
		
//		System.out.println(i.get(0).getPrice());
//		System.out.println(i.get(1));
//		System.out.println(i.get(2));
		
		Cart c = new Cart();
		
		for (int i = 0; i < it.size(); i++ ) {
			c.add(it.get(i));
		}
		
		System.out.printf("총합 : %d원", c.totalPrice());
		
		
		
		

	}

}
