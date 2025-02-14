package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1253_G4_좋다_이은채 {
	// good 은 모든 데이터가 될 수 있다.
	// 수의 위치가 다르면 값이 같아도 다른 수이다.
	
	/*
	 * 1. 입력받기
	 * 2. 데이터 정렬
	 * 3. 투포인트 알고리즘 적용
	 * 3-1. 시작 포인트와 끝 포인트 지정하기.
	 * 3.2. 
	 * for(i : N만큼 반복) {
        while(check) {
          int sum = A의 start 번째 + A의 end 번째 
          if( sum > A[i] ) {
              end -- 
          } 
          if( sum < A[i] {
              start ++
          }
          if( sum == A[i] {
              count++
              check = false
          }
          if(end == start) check = false
      }
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] data = new int[n];
		
		// 두번재 줄 입력값을 data 배열에 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
//		System.out.println(Arrays.toString(data));
		
		// 데이터를 정렬한다
		Arrays.sort(data);
		
		int start = 0, end = n-1; 
		int good = 0;
		
		
		// 투포인트 알고리즘 적용
		for (int i = 0; i < n; i++) {
			int x = data[i];
				while (start < end) {
					
					int sum = data[start] + data[end];
					// x 를 만족하는 경우
					if (sum == x) {
						good++;
						start++;
						end--;
					} else if (sum < x) {
						start++;
					} else {
						end--;
					}
				}
		}
		// 만족하는 쌍의 개수 출력하기
		System.out.println(good);
				
	}

}
