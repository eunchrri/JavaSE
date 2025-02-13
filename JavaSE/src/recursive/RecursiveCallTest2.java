package recursive;

import java.util.Iterator;

/*
 * 재귀 함수
 * 	: 함수 내에서 해당 함수를 또 호출
 * 
 * 	public static int a() {
 * 		return a();
 * 	}
 * 
 * 	a();			==> 함수 a 계속 반복
 * 
 * 반복 방법]
 * 1. 반복문 쓰기
 * 2. 재귀함수 쓰기	==> 모든 재귀함수는 반복문으로 바꿀 수 있다
 * 
 * for(초기값; 조건; 증감) => 증감을 주지 않으면 조건에 도달하지 못하므로 무한루프
 * 재귀함수도 조건을 주고 증감(함수의 인자로 부여)을 줘야 무한루프 돌지 않는다.
 * 
 * 용도]
 * 1. for: 다 재귀로 쓸 수 있다 / for 깊이가 정해져 있는 경우에만 사용 (반복의 깊이가 정해져 있는 경우)
 * 2. 재귀: 다 for 쓸 수 없다 / 깊이를 제어할 수 있을 때 (변수나 배열이 있을 때 => 4중 루프 ~ 배열 4칸 or 3중 루프 ~ 변수 주기, int depth;)
 * 	=> 
 * */

public class RecursiveCallTest2 {
	
	static int N = 10;
	// Bottom to Up
	public static int sum1(int n) {
		if(n == N) return n;
		return n + sum1(n+1);
	}
	
	// top down
	public static int sum2(int n) {
		if(n == 1) return n;
		return n + sum2(n-1);
	}
	//////////////////////////////////////////////////////////////////
	// 특정 조건일 때 재귀가 유도되는 구조
	// bottom up
	public static int sum3(int n) {
		if (n < N) {
			return n+sum3(n+1);
		}
		return N;
	}
	// Top down
	public static int sum4(int n) {
		if (n > 1) {
			return n+sum4(n-1);
		}
		return 1;
	}
	
	
	public static void main(String[] args) {
		// sum: bottom up
		int sum = 0;
		for (int i = 0; i <= N; i++) {
			sum += i;
		}
		System.out.println("sumBU: "+sum);
		
		// sum: top down
		sum = 0;
		for (int i = N; i > 0; i--) {
			sum += i;
		}
		System.out.println("sumTD: "+sum);
		
		System.out.println("sum1: "+sum1(1));
		System.out.println("sum2: "+sum2(N));
		System.out.println("sum3: "+sum3(1));
		System.out.println("sum4: "+sum4(N));
		
		
	}

}
