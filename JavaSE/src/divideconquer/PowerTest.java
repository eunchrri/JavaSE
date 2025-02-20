package divideconquer;

/**
 * Divide Conquer (분할 정복)
 * 분할 : 해결할 문제를 여러 개의 작은 부분으로 나눈다. 
 * 정복 : 나눈 작은 문제를 각각 해결한다. 
 * 통합 : (필요하다면) 해결된 해답을 모은다.
 * 
 * ex) 머지정렬, 퀵정렬, 이진검색
 */
public class PowerTest {
	// 재귀
	public static long powerRec(int x, int n) {
		if(n == 1 ) return x;
		return x * powerRec(x, n-1);
	}
	// 분할 정복
	static int cnt;
	public static long dcPower(int x, int n ) {
		cnt++;
		if (n == 1) return x;
		if (n == 0) return 1;
		long let = dcPower(x, n>>1);
		if (n%2==0) {
			return let * let;
		} else {	// 홀수인 경우
			return let * let * x;
		}
	}
	public static void main(String[] args) {
//		6268685802422096249
//		System.out.println(powerRec(9, 2111111111));
		long result = 1;
		int n = 9;
		// 시퀀스하게 연산을 하기 때문에 21억번 반복
		for (int i = 0; i < 2111111111; i++) {
			result*=n;
		}
//		System.out.println(result);
		
		// logN의 시간 복잡도
		System.out.println(dcPower(9, 2111111111));
		System.out.println(cnt);

//		System.out.println(powerRec(4, 4));
//		System.out.println(dcPower(4, 4));
//		System.out.println(16*16);
	}
}













