package windowProgramming;

public class Window {
	private int width; // window 창의 가로
	private int height; // window 창의 세로
	private boolean isVisible;
	private int top; // window 창의 위치
	private int left; // window 창의 위치
	
	// get set 메소드 만들기
	
	public void setwidth(int width) {
		this.width = width;
	}
	public void setheight(int height) {
		this.height = height;
	}
	public void setisVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public void settop(int top) {
		this.top = top;
	}
	public void setleft(int left) {
		this.left = left;
	}
	
	public int getwidth() {
		return width;
	}
	public int getheight() {
		return height;
	}
	public boolean getisVisible() {
		return isVisible;
	}
	public int gettop() {
		return top;
	}
	public int getleft() {
		return left;
	}
}
