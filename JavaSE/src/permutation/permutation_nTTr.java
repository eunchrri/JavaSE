package permutation;

import java.util.Arrays;

public class permutation_nTTr {
	
	static int N;			// 원소 개수
	static int R;			// 뽑을 개수
	static int[] input;		// 입력 데이터
	static int[] numbers;	// 뽑은 순열을 담을 배열
	static int tc;
	
	public static void main(String[] args) {
		input = new int[] {1,2,3,4,5};
		N = input.length;
		R = 2;				// R개를 선택가능.
		numbers = new int[R];
		permu(0);
		System.out.printf("%dTT%d 중복 순열의 개수: %d%n", N, R, tc);
	}
	
	public static void permu(int depth) {
		/*
		 * 배열은 0부터 시작하므로 R-1의 위치까지가 모든 원소를 뽑은 상황
		 * depth 가 R 개인 상황은 하나의 순열에서 모든 원소를 다 뽑은 상황이므로 종료
		 */
		if (depth == R) {
			tc++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		// depth 번째의 원소를 선택해야 한다.
		for (int i = 0; i < N; i++) {
			numbers[depth] = input[i];
			permu(depth+1);
		}
	}

}
