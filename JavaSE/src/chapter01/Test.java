package chapter01;

import java.util.Iterator;

public class Test {
	//main함수 : 프로그램의 시작점
	public static void main(String[] args) {
		
		// print(data): 명령창에 출력, 엔터 없이 옆으로 이어서 출력
		System.out.print("hello "); // new line
		System.out.println("world");    // 실행은 ctrl+f11
		
		// println(data): 명령창에 출력 후 엔터까지
		// window: \n\r			linux, unix: \r
		System.out.println("잘해 봅시당!!");
		System.out.println("알고보면 자바도 좋아요 ㅋㅋㅋㅋ");
		
		/*
		* printf(format, data)
		* 
		* %d: 정수
		* %f: 실수	(%.2f : 소수점 두자리까지 출력)
		* %s: 문자열
		* %c: 문자
		* %b: 논리
		* 
		* %n: new line(엔터효과)
		*/
		
		
		System.out.printf("안녕하세요 저는 %s이고 나이는 %d입니다.%n", "uplus", 2);
		
		double pi = 3.141592;
		System.out.printf("PI: %.3f%n", pi);
		
		//문자열 + anyType, anyType + 문자열 => 문자열이 된다.
		//숫자+'' => 문자열
		String name="lec";
		int age = 17;
		System.out.println("제 이름은 "+name+"입니다. age: "+age);
		
		/*
		 * 문자열은 변경할 수 없다.
		 * 그래서 + 연산을 하면 기존의 객체를 버리고 새로 생성한다. <= 성능 저하 원인
		 * 
		 * 많은 양의 문자열 정보를 새로 생성해서 출력할 경우 stringBuilder를 이용한다.
		*/
		StringBuilder sb = new StringBuilder(100);	// 배열의 크기가 100인 StringBuilder 생성
		//append() : 저장된 내용의 맨 끝에 추가
		
		sb.append("Hello");
		sb.append("world");
		sb.append("java");
		System.out.println(sb); 
		}
	}
