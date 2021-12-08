package application;

import collections.Pair;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;


public class App {

	public static void main(String[] args) {
		// int의 객체타입 Integer
		Pair<Integer, Cat>pair = new Pair<>(1, new Cat("마틸다"));
		
		System.out.println(pair);
		
		System.out.println(pair.getOne()); // value1의 값
		
		System.out.println(pair.getTwo()); // value2의 값
	
		Pair<Creature, Mammal> pair2 = new Pair<>(new Creature("생물"), new Mammal("포유류"));
		
		System.out.println(pair2);
	
	}
	

}
