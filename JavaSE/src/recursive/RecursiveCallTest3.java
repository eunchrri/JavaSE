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
 * */

public class RecursiveCallTest3 {
	
	static int N = 5;						// 10! 의 경우의 수 360000 정도
	// Bottom to Up
	public static int fac1(int n) {
		if (n == N) return n;
		return n*fac1(n+1);
	}
	
	// Top to Bottom
	public static int fac2(int n) {
		if (n == 1) return 1;
		return n*fac2(n-1);
	}
	
	public static void main(String[] args) {
		
		// factorial: bottom up
		int fac = 1;
		for (int i = 1; i <= N; i++) {
			fac *= i;
		}
		System.out.println("for - Bottom to Up: "+fac);
		
		System.out.println("재귀 - Bottom to Up: "+fac1(1));
		System.out.println("재귀 - Top to down : "+fac2(N));
		
		
	}

}
