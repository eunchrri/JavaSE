package chapter03;

import java.util.Arrays;

/*
 * 배열
 * 	- 하나의 변수에 여러 개의 공간을 할당하고
 * 	  동일한 타입의  데이터를 저장 관리
 * 
 * 	- 어떤 타입도 배열로 선언할 수 있고,
 * 	  배열로 선연하면 Reference 타입이 된다.
 * 
 * 	- 주소값으로 배열에 접근할 수 없다.
 * 	  인자로 배열을 넘겨줄 수 없다. => 자바는 포인터가 없기 때문에 주소로 접근 불가. 그래서 hashcode 가 필요.
 * 
 * 	- 배열 객체를 생성하면 length 라는 속성을 가지게 되고
 * 	  length 는 배열의 크기
 * 
 * 	- index 를 통해서 접근하고 index 는 0부터 시작한다.
 *    => 접근할 수 있는 index 는 0부터 length-1까지 이다.
 *    ===> 접근 범위를 벗어나면 ArrayIndexOutOfBoundsException 오류가 발생한다.
 *    
 *  - 배열을 사용하면 size 를 변경할 수 없다.
 *    => 변경할 필요가 있다면 다시 생성해서 copy 해야 한다.
 *    
 *  - 객체를 생성하면 기본 값으로 초기화 된다.
 *    정수: 0
 *    실수: 0.0
 *    논리: false
 *    문자: \u0000
 *    객체: null
 *    
 *  - 선언 방법
 *    DataType [ ] 변수명;					DataType 변수명[ ]	;
 *    int [] a,b,c[]; // 대괄호 개수가 차원
 *  
 *  - 생성
 *    변수명 = new DataType[size];			// 자바는 무조건 사이즈를 줘야 한다.
 *    
 *  - 선언 & 생성
 *    DataType [] 변수명 = new DataType[size];
 *    
 *  - 접근
 *    변수명[index]
 *    
 *  - 선언 & 생성 & 할당
 *    DataType[] 변수명 = {값1, 값2, ...};		// 값의 개수 만큼의 크기로 배열이 생성된다.
 *    
 */


public class ArrayTest1 {

	public static void main(String[] args) {
		int[] a1, a2;		// a1, a2는 1차원 int 배열
		int b1, b2[];		// b1는 int, b2는 1차원 int 배열
		int[] c1, c2[];		// c1은 1차원 int 배열, c2는 2차원 int 배열
		
		int[] array = new int[3];
		for (int i = 0, size = array.length; i<size; i++) {
			System.out.printf("array[%d]: %d%n", i, array[i]);
		}
		System.out.println(Arrays.toString(array));
		
		int[] array2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(array2));
	}

}
