package main;

import java.time.LocalDate;

public class User {
	private String id;
	private String password;
	private int number = 0;
	private static int count = 0;

	public User(String id, String password) {
		this.id = id;
		this.password = password;
		count++;
		number = count;
		
	}
	
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", 사용자번호=" + number + "]";
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getNumber() {
		return number;
	}
	public LocalDate getDate() {
		LocalDate now = LocalDate.now();
		return now;
	}
	
}
