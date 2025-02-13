package recursive;

public class RecursiveCallTest4 {

	public static void main(String[] args) {
		// fibonacci 
		System.out.println(fibo(7));		// 1 1 2 3 5 8 13
	}

	public static int fibo(int n) {
		// n이 2 이하일 때는 1 주기
		if (n<=2) return 1;
		return fibo(n-1)+fibo(n-2);			// 현재 = 이전1 + 이전2 => Bottom to Up
	}
}