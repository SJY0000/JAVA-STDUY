package collections;

// Genaric 타입 클래스 
// 타입을 런타임에 지정, 사용할 때 지정해주면 됨
// <> 안에 들어가는 것은 아무거나 설정가능
// Object -> <E>
public class Wrapper<E> {
	private E object;
	
	public void set(E object) {
		this.object = object;
	}
	
	public E get() {
		return object;
	}
}
