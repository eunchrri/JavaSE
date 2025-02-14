package datastructure;

import java.util.HashSet;
import java.util.TreeSet;

import chapter06.Employee;

/**
 * 
 * Set 
 * - 동일한 객체를 저장하지 않음 
 * 	 => 데이타의 유니크성을 보장 
 * - add(Object o), contains(Object o), remove(Object o)에서 
 * 	 equals(Object o)와 hashCode()를 호출하여 객체가 같은지 비교한다. 
 * - 데이타를 저장한 순서대로 저장하지 않는다. 
 * - index 가 없다.
 * 
 * TreeSet 
 * - set 과 동일하게 유니크성을 보장하면서 tree 를 이용해서 정렬을 유지한다. 
 * 	 ==> 정렬시 Comparable interface 의 compareTo()를 이용하므로 
 *       (주의) 저장할 객체에 Comparable interface 구현해야 된다.
 */
public class SetTest {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		System.out.println(set1.add("hello"));
		System.out.println(set1.add("hello"));
		System.out.println(set1.add("world"));
		System.out.println(set1.add("UPlus"));
		System.out.println(set1);
		
		// hashcode 함수를 오버라이드
		Employee emp1 = new Employee("1", "1", 0);
		Employee emp2 = new Employee("1", "1", 0);
		System.out.println("emp1: "+emp1.hashCode());
		System.out.println("emp2: "+emp2.hashCode());
		System.out.println("emp2==emp1:"+(emp1==emp2));	// 내용만 같지 실제 객체는 다르다.
		
		HashSet<Employee> set3 = new HashSet<>();
		System.out.println(set3.add(emp1));
		System.out.println(set3.add(emp2));
		System.out.println(set3);
		
		TreeSet<String> set2 = new TreeSet<>();
		System.out.println(set2.add("UPlus"));
		System.out.println(set2.add("world"));
		System.out.println(set2.add("hello"));

		for (String str : set2) {
			System.out.println(str);
		}
	}
}
