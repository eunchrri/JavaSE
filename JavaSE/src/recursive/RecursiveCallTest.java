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
 * 1. for: 다 재귀로 쓸 수 있다 / for의 깊이가 정해져 있는 경우에만 사용 (반복의 깊이가 정해져 있는 경우)
 * 2. 재귀: 다 for로 쓸 수 없다 / 깊이를 제어할 수 있을 때 (변수나 배열이 있을 때 => 4중 루프 ~ 배열 4칸 or 3중 루프 ~ 변수 주기, int depth;)
 * 	=> 
 * */

public class RecursiveCallTest {
	
	static int N = 10;
	// Buttom to Up
//	public static int sum1(int i) {
//		// 기저조건: 재귀함수를 중단하는 조건
//		if (i == N) return N;
//		return sum1(i+1)+i;
//	}
	public static void print(int num) {
		if (num > N) return;
		System.out.print(num+" ");
		print(num+1);	// 함수의 인자를 증감으로 주기
	}
	
	// 특정 조건을 만족할 때 재귀가 진행되는 구조
	// bottom -> up
	public static void print3(int num) {
		if(num <= N) {
			System.out.print(num+" ");
			print3(num+1);
		}
	}
	// top ->  down
	public static void print4(int num) {
		if(num > -1) {
			System.out.print(num+" ");
			print4(num-1);
		}
	}
	
	public static void main(String[] args) {
		
		print3(0);
		System.out.println();
		print4(N);
		System.out.println();
		
		for (int i = 0; i <= N; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		print(0);
		System.out.println();
		
		for (int i = N; i > -1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		print2(N);
	}
	public static void print2(int num) {
		if(num == -1) return;
		System.out.print(num+" ");
		print2(num-1);
	}
}
