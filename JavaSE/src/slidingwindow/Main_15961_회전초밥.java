package slidingwindow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_15961_회전초밥 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 접시 수 N
		int N = Integer.parseInt(st.nextToken());
		// 초밥 가짓수 d
		int d = Integer.parseInt(st.nextToken());
		// 반복 횟수 k
		int k = Integer.parseInt(st.nextToken());
		// 쿠폰 번호 c
		int c = Integer.parseInt(st.nextToken());
		// 중복 제거 set 만들기 hashset 이용
		Set<Integer> arrDelete = new HashSet<>();
		
		// 그 뒤 N개의 접시 번호를 nums 배열에 저장한다.
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
//		System.out.println(nums); => 이렇게 하면 출력결과 [I@5caf905d
		// 배열 잘 생성됐나 확인
//		System.out.println(Arrays.toString(nums));
		
		// 빈 배열을 하나 만든다. 크기는 k+1 개
		int[] arr = new int[k+1];
		// 빈 배열의 맨 앞 번호는 쿠폰 번호로 지정한다.
		arr[0] = c;
		
		// 첫 윈도우를 배열에 저장한다.
		for (int i = 0, size=k; i < size; i++) {
			arr[i+1]=nums[i];
		}
		
		// 중복이 가장 적은 배열 저장
		int minDuplicateArr[] = new int[k+1];
		
		// 배열 잘 생성됐나 확인
//		System.out.println(Arrays.toString(arr));
		
		// N-K만큼 반복 돌면서 SW 적용한다.
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < k; j++) {
				arr[j] = arr[j+1];
			}
			// 새로운 값 추가 - 원형 배열 고려한 처리
			arr[k] = nums[(i+k) % N];
			
			// 배열 잘 생성됐나 확인
//			System.out.println(Arrays.toString(arr));
			
			// hashset 사용하여 생성된 배열에 중복을 제거하고
			for (int num : arr) {
                arrDelete.add(num);  // 중복이 자동 제거됨
            }
		}
		
		
		
	}

}
