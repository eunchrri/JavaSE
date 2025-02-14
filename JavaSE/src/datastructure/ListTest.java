package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

import chapter06.Employee;

/**
 * List : 
 * - 데이타를 저장한 순서대로 저장해 준다. 
 * - 데이타의 Index는 0부터 size()-1이다 
 * - 중간 삽입할 수 있는 Index는 0부터 size()까지 이다.
 *  => 범위를 벗어나면 IndexOutOfBoundsException이 발생한다. 
 * - 데이타를 중복해서 저장할 수 있다. 
 * - indexOf(Object o)
 * , lastIndexOf(Object o)
 * , contains(Object o) 해당하는 객체가 있으면 t, 없으면 f
 * , remove(Object o)에서 해당 기능을 수행하기 위해 equals(Object o)를 호출해서 객체가 같은지 비교후 처리한다.
 * 
 * Array list는 중간 삽입 삭제할때 너무 부담이 크다
 * Linked list는 중간 삽입 삭제할 때 좋지만 heap을 사용하기 때문에 탐색 속도가 많이 느리다. 그리고 중간 데이터를 바로 접근할 수 없다
 * 이유는 중간에 데이터가 어디에 저장되어 있는지 바로 전 데이터만 알기 때문이다. 그래서 처음 데이터부터 링크 따라가며 접근해야 한다.
 * 링크가 한쪽 방향으로만 있기 때문에 중간에 다시 이전으로 돌아갈 수 없다.
 * double로 링크를 유지해주면 양방향으로 진행할 수 있다. 저장하고 싶은 데이터 말고도 두개의 링크를 저장해야 하기 때문에 공간낭비가 심하다.
 * link가 heap통해서 이동하기 때문에 시간도 많이 걸린다.
 * 
 * 자바의 자료 구조는 다 객체만 저장할 수 있다.
 * 
 */
public class ListTest {
	public static void main(String[] args) {
		
		// ArrayList는 크기를 알고 쓰자
//		ArrayList list = new ArrayList(10);
		LinkedList list = new LinkedList();
		list.add("hello"); // 맨 끝에 추가
		list.add("hello");
		list.add("java");
		list.add(3.14);
		list.add(new Employee("1", "1", 5000));
//		list.add(0, 256); // index번째 추가됨.
//		list.add(6, 256);		//IndexOutOfBoundsException 발생. 
		System.out.println(list.get(2));
		System.out.println(list);

		/*
		 * java5에 컬렉션에 Generic을 적용 - 선언과 생성시 저장할 타입를 지정 => 지정한 타입 외에는 저장할 수 없다. - 추출시
		 * 형변환 없이 바로 사용 형식] 컬렉션<저장할타입> 변수 = new 컬렉션<저장할타입>();
		 */
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("hello");
//		list2.add(1);		// string 으로 지정했기 때문에 다른 타입으로 저장하면 error.
		
		ArrayList<Employee> list3 = new ArrayList<>();
		list3.add(new Employee("1", "1", 100000000));
		System.out.println(list2.indexOf(new Employee("1", "1", 100000000)));
	}
}
