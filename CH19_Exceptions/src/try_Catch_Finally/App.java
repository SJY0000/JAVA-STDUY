package try_Catch_Finally;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		try { // 예외가 발생할 수 있는 코드를 적용 
			// 예외가 발생하면 코드 진행을 멈추고 catch문으로 넘어간다
			p1.setName(null); 
			System.out.println("예외발생 시 여기는 실행안됨");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally { // 예외 발생 시 프로그램 종료가 아니라 여기로 이동
			// 여기는 예외가 발생하든 안하든 무조건 실행됨
			System.out.println("finally 무조건 실행");
		}
		
		System.out.println("프로그램 종료");

	}

}
