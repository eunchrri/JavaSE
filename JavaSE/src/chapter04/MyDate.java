package chapter04;

import java.util.Calendar;

/**
 * modifier(제어자)
 * 
 * access modifier		public 	protected	생략(default)	private
 * usage  modifier		abstract	static	final
 * 
 * access modifier	: 클래스, 메서드, 속성에 대한 접근을 제한한다.									// 수정성을 높이기 위해서
 * 		public 		: 접근 제한이 전혀 없다.													// 수정 안한다는 의미
 * 		protected	: 상속 관계에서는 제한이 없다. 상속 관계가 아니면 같은 package가 아닌 경우 접근 불가		// ''
 * 		생략(default): 같은 package가 아닌 경우 접근 불가
 * 		private		: 선언한 클래스 내에서만 접근 가능											// 수정할 것 같은 데이터는 private로 
 * 		
 * usage  modifier	: 클래스, 메서드, 속성의 기능을 제한한다.
 * 
 * Encapsulation
 * 	- 대부분의 속성과 일부 메소드를 private, default(생략), protected를 이용해서 캡슐로 싸는 기능
 * 	- 목적
 * 		1. 보호
 * 		2. 은닉 ==> decouple 효과 및 유지보수성을 높인다.
 * 	- 접근할 수 있는 public 한 메서드 (getter, setter)를 제공해야 한다.
 */
public class MyDate {
	private int year, month, date;		// private: 이 블럭 안에서만 쓸 수 있음
	String name;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year<2024) {
			System.out.println("2024년 이후로 설정해 주세요");
		} else {
			this.year = year;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
}


















