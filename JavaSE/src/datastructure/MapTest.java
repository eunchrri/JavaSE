package datastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import chapter06.Employee;

/**
 * Map 
 * - 유일한 key 값으로 value 를 관리하는 자료구조 => key 값이 유니크
 * - 검색이 가장 빠른 자료구조
 * 
 */
public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer, Object> map1 = new HashMap<>();
//		put(key, value)
		map1.put(1, "hello");
		map1.put(2, 256);
		map1.put(3, new Employee("1", "ssafy", 3500000));
		map1.put(1, "world"); // 같은 key로 다른 value를 저장하면 덮어쓰기 됨.
		System.out.println(map1);
		
//		get(key) 
		System.out.println(map1.get(1));

//		remove(key)  :key 에 해당하는 객체를 삭제하고 삭제한 데이타를 리턴한다. 
		System.out.println(map1.remove(1));
		System.out.println(map1);			// {2=256, 3=empno=1, name=ssafy, salary=3500000}
		
		// keySet() : map 에 저장된 key 값만 추출 ==> set 으로 리턴
		Set<Integer> key = map1.keySet();
		for (Integer k : key) {
			System.out.println(k);
		}
		
		// values() : map 에 저장된 value 값만 추출 ==> collection
		Collection<Object> values = map1.values();
		for (Object v : values) {
			System.out.println(v);
		}
	}
}
