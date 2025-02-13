package slidingwindow;

import java.util.Iterator;

/**
 * 길이가 N인 배열에서 길이가 K인 서브 배열의 특정 연산시 최적의 값을 구하는 경우 
 *  
 * 정수로 이루어진 길이가N인 배열에서 길이가 K인 서브 배열의 합계가 가장 큰 서브 배열은?
 * - ex)[2,4,7,10,8,4,5,6,7,1]  
 * 
 * - sequential로 풀 때 시간 복잡도: k*(N-k+1)
 *  ex) 회전초밥(고) 
 *  2≤N≤3,000,000
 *  2≤k≤3,000 (k≤N) 3,000*(3,000,000-3,000+1) => 89억 정도 ==> 시간 초과
 *
 */
public class MaxSumArray1 {
	public static void main(String[] args) {
		int[] nums = {2,4,7,10,8,4,5,6,7,1};
		int max = 0, sum=0;
		int k= 4;
//		System.out.println((3000000L-3000L+1L)*3000L);
		
		// max의 subset의 시작 인덱스
		int idx = 0;			
		
		// 배열 전체를 탐색하면서
		for (int i = 0, size = nums.length-k; i < size; i++) {
			sum = 0;
			
			// k개 만큼 반복하면서 sum을 구하기
			// i번째 위치에 있는 원소부터 k 개를 sum 해야 한다.
			// start 위치 주의
			for (int j = i, end = i+k; j < end; j++) {
				sum += nums[j];
			}
		
			// max 값과 같은지 비교한다.
//			max = Math.max(max, sum);
			if (max < sum) {
				max = sum;
				// max가 되는 sum의 시작 위치를 갱신
				idx = i;
			}
		}
		
		System.out.println(max+" "+idx);
		System.out.println(max);
		for (int i = idx, end=idx+k; i < end; i++) {
			System.out.printf("%d ", nums[i]);
		}
	}
}
