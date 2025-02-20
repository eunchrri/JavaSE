package permutation;

import java.util.Scanner;

/*
 * 순열
 * 	- 서로 다른 n 개의 원소에서 r 개를 순서를 고려해서 선택(나열)하는 것을 순열이라 한다.
 *	- r 개만큼 중첩해야 함. => O(n^r)
 *
 *	- r 개가 랜덤이라면 for 문으로 작성하기 어렵다.
 * */
public class Permutation_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 원소 수
		int N = sc.nextInt();
		int[] data = new int[N];
		
		for (int i = 0; i < N; i++) {
			data[i] = sc.nextInt();
		}
		
		/*
		 * 중복순열 : 중복해서 원소를 선택 nTTr
		 */
		int cnt = 0;
		for (int i = 0; i < N; i++) {			// 첫번째 원소 반복
			for (int j = 0; j < N; j++) {		// 두번째 원소 반복
				for (int k = 0; k < N; k++) {	// 세번재 원소 반복
					cnt++;
					System.out.printf("%d %d %d%n", data[i], data[j], data[k]);
				}
			}
		}
		System.out.printf("%dTT3 중복 순열의 개수 %d%n", N, N, cnt);
		
		System.out.println("=======================순열=======================");
		cnt = 0;
		for (int i = 0; i < N; i++) {					// 첫번째 원소 반복
			for (int j = 0; j < N; j++) {				// 두번째 원소 반복
				if (i != j) {							// 두번째 원소는 첫번재와 같으면 안됨.
					for (int k = 0; k < N; k++) {		// 세번재 원소 반복
						if (i != k && j!=k) {							
							cnt++;
							System.out.printf("%d %d %d%n", data[i], data[j], data[k]);
						}
					}
				}
			}
		}
		System.out.printf("%dP3 순열개수: %d", N, cnt);
		
	}

}
