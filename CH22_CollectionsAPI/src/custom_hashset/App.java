package custom_hashset;

import java.util.HashSet;
import java.util.Objects;

class Creature {
	private int id;
	private String name;

	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Creature [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id;
	}
}
public class App {
	public static void main(String[] args) {
		// Set 타입은 데이터 중복이 안되고 순서가 없어서 index번호가 없음
		// LinkedHashSet은 중복이 안되고 입력된 순서대로 출력됨
		HashSet<Creature> creatures = new HashSet<>();

		creatures.add(new Creature(0, "고양이"));
		creatures.add(new Creature(1, "개"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(3, "소"));
		creatures.add(new Creature(4, "말"));
		creatures.add(new Creature(4, "비둘기"));
		// 전부 다른 객체이기 때문에 중복인 데이터 입력할 수 있음

		System.out.println(creatures.contains(new Creature(0, "고양이"))); // fruits 안의 데이터중 ()안의 데이터가 있으면 true 없으면 false,
																		// 다른 객체이기때문에 false 출력
		creatures.forEach(System.out::println);
	}
}
