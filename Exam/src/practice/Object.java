package practice;

public interface Object extends Runnable {
	 default void displayDetail() {
		System.out.println("표시할 디테일 없음");
	}

	
}
