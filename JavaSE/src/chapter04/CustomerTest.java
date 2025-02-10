package chapter04;

public class CustomerTest {

	public static void main(String[] args) {
		/*
		 * 객체 선언		클래스명 변수명;
		 * 객체 생성		변수명 = new 클래스명([인자]);
		 * 객체 접근		변수명.속성명		변수명.함수명
		 * 
		 * 선언 & 생성
		 * 클래스명 변수명 = new 클래스명([인자]);
		 * */
		
		// public Customer() {}
		Customer cust1 = new Customer();
		cust1.name="UPlus";
		cust1.age=2;
		cust1.address="강남구 선릉역";
		
		// public Customer(String n, String ad, int a)
		Customer cust = new Customer("UPlus", "강남구", 2);
		Customer cust2 = new Customer();
		
		// toString 메서드는 호출하지 않아도 자동으로 호출된다.
		System.out.println(cust1.toString());
		System.out.println(cust1);
		
		System.out.println(cust.toString());
		System.out.println(cust2);
		System.out.println(new Customer("lec","용산구",27).toString());
		System.out.println(new Customer(null, null, 0).toString());
		
		Customer cust3 = new Customer("1", "1", 2);
		System.out.println(cust1.equals(cust3));
	}

}
